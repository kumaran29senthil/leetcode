class Solution {
    public int mostFrequentEven(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2==0)
            {
                if(map.containsKey(arr[i]))
                {
                    map.put(arr[i],map.get(arr[i])+1);
                }
                else
                {
                    map.put(arr[i],1);
                }
            }
        }
          if (map.isEmpty()) return -1;
        int max=Integer.MIN_VALUE,result=-1;
        for(Map.Entry<Integer,Integer> entry:map.entrySet())
        {
            if(entry.getValue()>max || (entry.getValue() == max && entry.getKey() < result))
            {
                max=entry.getValue();
                result = entry.getKey();
            }
        }
        return result;
    }
}
