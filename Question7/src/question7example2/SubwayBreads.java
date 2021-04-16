/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question7example2;

/**
 * It is the enum class subwaybread
 * @author Tejaswi Avula
 */
public enum SubwayBreads {
    /**
     * it is a constant wheat bread of footlong 8.5 and sixinch5.5
     */
    WHEAT_BREAD(8.5, 5.5),
    /**
     * it is a constant white bread of footlong 8.0 and sixinch 5.0
     */
    WHITE_BREAD(8.00, 5.00),
    /**
     *it is a constant italian herband cheese of footlong 9.0 and sixinch 6.0
     */
    ITALIAN_HERBAND_CHEESE(9.0, 6.0),
    /**
     * it is a constant maltedrye of footlong 8.5 and sixinch5.5
     */
    MALTED_RYE(8.5, 5.5);

    private double footLong;
    private double sixInch;

    private SubwayBreads(double footLong, double sixInch) {
        this.footLong = footLong;
        this.sixInch = sixInch;
    }

    /**
     * returns footlong
     * @return
     */
    public double getFootLong() {
        return footLong;
    }

    /**
     * returns sixinch
     * @return
     */
    public double getSixInch() {
        return sixInch;
    }
}
