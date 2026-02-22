class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        int sum=Integer.MAX_VALUE;
        ArrayList<String> list = new ArrayList<>();
        for(int i=0;i<list1.length;i++){
            int temp=Integer.MAX_VALUE;
            for(int j=0;j<list2.length;j++){
                if(list1[i].equals(list2[j])){
                    temp = i + j;
                    break;
                }
            }
            if(temp<sum){
                sum=temp;
            }
        }
        for(int i=0;i<list1.length;i++){
            for(int j=0;j<list2.length;j++){
                if(list1[i].equals(list2[j])){
                    if(i+j==sum){
                        list.add(list1[i]);
                        break;
                    }
                }
            }
        }
        return list.toArray(new String[0]);
    }
}