public class RemoveDuplicate {
       public static void removeDuplicate(String str , int idx , StringBuilder newstr , boolean map[]){
        if(idx == str.length()){
            System.out.println(newstr);
            return;
        }
        //kaam
        char currChar = str.charAt(idx);
        if(map[currChar - 'a'] == true ){
            //duplicate
            removeDuplicate(str, idx+1, newstr, map);

        } else {
            map[currChar - 'a'] = true;
            removeDuplicate(str, idx, newstr.append(currChar), map);            
        }
       }
    public static void main(String[] args) {
        String str = "appnnacollege";
        removeDuplicate(str, 0,new  StringBuilder(""), new boolean[26]);
    }
}
