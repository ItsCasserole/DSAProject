public class OrderedList
{

	/*
    ListRA<String> list;

    public OrderedList()
    {
        list = new ListRA<String>();
    }

    public int size()
    {
        return list.size();
    }

    public boolean isEmpty()
    {
        return list.isEmpty();
    }

    public void add(String item)
    {
        int index = search(item);

        if(index < 0) //only add if item is not in list
        {
            index = (index + 1) * -1;
            list.add(index, item);
        }
    }

    public String get(int index) throws ListIndexOutOfBoundsException
    {
        return list.get(index);
    }


    //Eager advancing, postpone checking equality
    public int search(String item)
    {
        int index = -1;
        if(list.size() > 0)
        {
            int low = 0;
            int high = list.size() - 1;
            int mid = 0;

            while(low < high)
            {
                mid = (low + high) / 2;

                if(item.compareTo(list.get(mid)) < 0)
                {
                    high = mid;
                }
                else
                {
                    low = mid + 1;
                }
            }

            int comp = item.compareTo(list.get(mid));

            if(comp == 0)
            {
                index = mid;
            }
            else if(comp < 0)
            {
                index = (mid * -1) - 1;
            }
            else //If item needs to be put at end of list
            {
                index = (mid * -1) - 2;
            }
        }
        return index;
    }

    public void remove(int index) throws ListIndexOutOfBoundsException
    {
        list.remove(index);
    }

    public void clear()
    {
        list.removeAll();
    }

    public String toString()
    {
        return list.toString();
    }
*/
}
