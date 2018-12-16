package ru.loginovskiy.algorithm.recursy.backpack;
public class BackPuck
{
    Item[] pack;
    Item[] buf;
    protected int maxWeight;
    protected int index;
    protected int packIndx = 0;

    public static void main(String[] args)
    {
        BackPuck pack = new BackPuck(10, 15);
        Item[] items = new Item[10];
        items[0] = new Item(3, 5);
        items[1] = new Item(2, 1);
        items[2] = new Item(4, 2);
        items[3] = new Item(3, 6);
        items[4] = new Item(3, 1);
        items[5] = new Item(5, 3);
        items[6] = new Item(5, 4);
        items[7] = new Item(5, 7);
        items[8] = new Item(2, 8);
        items[9] = new Item(1, 2);

        for (int i = 0; i < items.length ; i++)
        {
            pack.initBuf(items[i]);
        }
        pack.show(pack.buf);
        pack.put();
        pack.show(pack.pack);
    }
    BackPuck()
    {
        this(15, 15);
    }

    BackPuck(int size, int max)
    {
        pack = new Item[size];
        buf = new Item[size];
        index = 0;
        maxWeight = max;
    }

    public void initBuf(Item i)
    {
        i.k = (float)i.price/i.weight;
        buf[index++] = i;
        sortBuf();
    }

    private void sortBuf()
    {
        for (int i = 0; i < index; i++)
        {
            for (int j =0; j < index - 1; j++)
            {
                if (buf[j].k > buf[j +1].k) swap(j, j + 1);
            }
        }
    }

    private void show(Item[] arr)
    {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < (arr.equals(buf)?buf.length:packIndx) ; i++)
        {
            sb.append("(");
            sb.append(arr[i].weight + " ");
            sb.append(arr[i].price + " ");
            sb.append(arr[i].k + ")");
        }
        sb.append("]");
        System.out.println(sb.toString());
    }

    private boolean canPut(Item item)
    {
        pack[packIndx++] = item;
        maxWeight-=item.weight;
        if(isFull())return false;
        if(isOverload())
        {
            packIndx--;
            maxWeight+=item.weight;
            return true;
        }
        return true;
    }

    private void putItems(Item i)
    {
        if(!canPut(i))return;
        if(index<=0)return;
        putItems(buf[--index]);
    }

    public void put()
    {
        putItems(buf[--index]);
    }
    private void swap(int i, int j)
    {
        Item temp = buf[i];
        buf[i] = buf[j];
        buf[j] = temp;
    }

    private boolean isOverload()
    {
        return maxWeight < 0;
    }

    private boolean isFull()
    {
        return maxWeight == 0;
    }

}
