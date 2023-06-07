public class StringReverse {
    public static void main(String[] args) {
        String str="This is Paul Eke";
        String[] arr=str.split(" ");

        StringBuilder builder=new StringBuilder("");
        for(int i=arr.length-1; i>=0;i--){
            builder.append(arr[i]+" ");
        }
        System.out.println(builder.toString());
    }

}
