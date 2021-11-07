/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assig3;

/**
 *
 * @author sg250631
 */
public class Ball implements Tossable {
    private String  brandN;



    public Ball(String b) {

        this.brandN = b;
    }



    public String getBrandN() {

        return brandN;

    }



    public void setBrandN(String br) {

        this.brandN= br;

    }

    public void bounce()

    {}



    @Override

    public void toss() {

        throw new UnsupportedOperationException("Not vaild");
    
}
