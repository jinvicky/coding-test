class Solution {
    public String solution(String[] id_pw, String[][] db) {
        for(String[] user : db) {
            String id = user[0];
            String pwd = user[1];
            
            if(id_pw[0].equals(id)) {
                if(id_pw[1].equals(pwd)) return "login";
                else return "wrong pw";
            }
        }
        
        return "fail";
    }
}