package com.fitstepper;

public class UpdateUsrDataIn {
    private final int user_id;
    private final int bui_id;
    private final int new_level;
    private final int total_amount;

    public UpdateUsrDataIn(int user_id,int bui_id,int new_level,int total_amountb){
        super();
        this.user_id=user_id;
        this.bui_id=bui_id;
        this.new_level=new_level;
        this.total_amount=total_amount;
    }

   private int getuserid(){
    return user_id;
   }

   private int getbuiid(){
    return bui_id;
   }

   private int getnewlevel(){
    return new_level;
   }

   private int gettotalamount(){
    return total_amount;
   }



}
