/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feecalculator;

/**
 *
 * @author Harish Thadka
 */
public class FeeCalculator {


    public static final double UG_INCIDENTAL_FEE = 406.35;
    public static final double UG_DESG_FEE = 104.80;
    public static final double UG_TEXTBOOK_FEE = 6;
    public static final double UG_TECH_FEE = 20.70;
    public static final double UG_CS_FEE = 38;
    public static final double G_INCIDENTAL_FEE = 505.72;
    public static final double G_DESG_FEE = 115.55;
    public static final double G_TEXTBOOK_FEE = 0;
    public static final double G_TECH_FEE = 20.70;
    public static final double G_CS_FEE = 38;
    public static final double IGAS_FIRST_SEM = 1000;
    public static final double GRAD_NON_RES = G_INCIDENTAL_FEE * 0.5 * 3;
    public static final double INS_FIRST_SEM = 456.48;
    public static final double INS_SEC_THI_SEM = 760.2;
    public static final double INS_FOURTH_SEM = 456.48;
    public static final double IND_RUP_EX = 64.55;
    public static final double EURO_EX = 0.83;
    public static final double INT_STU_FEE = 75;
    public static final double ORIENT_FEE = 75;
    private String studentName;

    /**
     * Constructor sets Student Name
     *
     * @param studentName Student Name
     */
    public FeeCalculator(String studentName) {
        this.studentName = studentName;
    }

    /**
     * Returns the Student Name
     *
     * @return studentName
     */
    public String getStudentName() {
        return studentName;
    }

    /**
     * Method sets Student Name
     *
     * @param studentName Student Name
     */
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    /**
     * This method returns the first letter of every word from the student name
     * in uppercase
     *
     * @return NameInitials
     */
    public String getNameInitials() {

        String ret = studentName.substring(0, 1) + ".";

        for (int i = 0; i < studentName.length(); i++) {
            String st = studentName.substring(i, i + 1);
            if (" ".equals(st)) {
                ret = ret + studentName.substring(i + 1, i + 2) + ".";
            }

        }
        return ret.toUpperCase();
    }
    /**
     * This private method calculates cost of prerequisite course
     * @param preq Prerequisite
     * @return cost of prerequisite course
     */
    private double calcPrereqCost(int preq) {
        return (UG_INCIDENTAL_FEE + UG_DESG_FEE + UG_TEXTBOOK_FEE + UG_TECH_FEE + UG_CS_FEE) * 3.0 * preq;
    }
    /**
     * This method returns the  number of required course for sem 1
     * @param preq Prerequisite
     * @return Required courses
     */
    private int findReqCoursesForSem1(int preq) {
        if (preq == 1 || preq == 2) {
            return 2;

        } else {
            return 3;
        }

    }
    /**
     * This method calculates required course cost for a course
     * @return course cost
     */
    private double calcReqCourseCostForOneCourse() {
        return (G_INCIDENTAL_FEE + G_DESG_FEE + G_TEXTBOOK_FEE + G_TECH_FEE + G_CS_FEE) * 3.0;
    }
    /**
     * This method returns the scholarship for particular semester
     * @param sem Semester
     * @param preq Prerequisite
     * @param GPA GPA
     * @return calcSemCost
     */
    
    private double calcScholarship(int sem, int preq, double GPA) {
        if (sem == 1) {
            return IGAS_FIRST_SEM;
        } else {
            if (GPA >= 3.33) {
                if (sem == 2 || sem == 3) {
                    return GRAD_NON_RES * 3;
                } else {
                    if (preq == 0) {
                        return GRAD_NON_RES * 2;
                    } else {
                        return GRAD_NON_RES * 3;
                    }
                }

            } else {
                return 0.0;
            }
        }
    }
    /**
     * This method returns the total scholarship
     * @param sem Semester
     * @param preq Prerequisite
     * @param GPA GPA
     * @return calcSemCost
     */
    private double calcTotalScholarship(int sem, int preq, double GPA) {
        double calcTotal = 0.0;
        for (int i = 1; i <= sem; i++) {
            calcTotal += calcScholarship(i, preq, GPA);
        }
        return calcTotal;
    }

    /**
     * This method returns the cost for a Particular semester
     * @param sem Semester
     * @param preq Prerequisite
     * @param GPA GPA
     * @return calcSemCost
     */
    public double calcSemCost(int sem, int preq, double GPA) {
        double calSemCost;
        switch (sem) {
            case 1:
                calSemCost = calcPrereqCost(preq) + (calcReqCourseCostForOneCourse() * findReqCoursesForSem1(preq))
                        + INS_FIRST_SEM + INT_STU_FEE + ORIENT_FEE - calcScholarship(sem, preq, GPA);
                break;
            case 2:
                calSemCost = (calcReqCourseCostForOneCourse() * 3)
                        + INS_SEC_THI_SEM + INT_STU_FEE - calcScholarship(sem, preq, GPA);
                break;
            case 3:
                calSemCost = (calcReqCourseCostForOneCourse() * 3)
                        + INT_STU_FEE - calcScholarship(sem, preq, GPA);
                break;
            default:
                if (preq == 0) {
                    calSemCost = (calcReqCourseCostForOneCourse() * 2)
                            + INS_FOURTH_SEM + INT_STU_FEE - calcScholarship(sem, preq, GPA);
                } else {
                    calSemCost = (calcReqCourseCostForOneCourse() * 3)
                            + INS_FOURTH_SEM + INT_STU_FEE - calcScholarship(sem, preq, GPA);
                }

        }
        return calSemCost;
    }

    /**
     * This method returns the Total cost for all the semesters
     * @param sem Semester
     * @param preq Prerequisite
     * @param GPA GPA
     * @return calcTotalCost
     */
    public double calcTotalCost(int sem, int preq, double GPA) {
        double calcTotalCost = 0.0;
        for (int i = 1; i <= sem; i++) {
            calcTotalCost += calcSemCost(i, preq, GPA);
        }
        return calcTotalCost;
    }

    /**
     * This method returns returns the Indian currency value
     * @param totalCost
     * @return IndianRupees
     */
    public double exchUSDToINR(double totalCost) {
        return IND_RUP_EX * totalCost;
    }

    /**
     * This method returns returns the Euro currency value
     * @param totalCost
     * @return EuroRupees
     */
    public double exchUSDToEuro(double totalCost) {
        return EURO_EX * totalCost;
    }

    /**
     * Overrides the toString method and returns in specified pattern
     * @return getNameInitials
     */
    @Override
    public String toString() {
        return getNameInitials();
    }

    /**
     * This method returns the receipt
     * @param sem Semester
     * @param preq Prerequisite
     * @param GPA GPA
     * @return printReceipt
     */
    public String printReceipt(int sem, int preq, double GPA) {
        String printReceipt = String.format("%s, on a whole the total scholarship till semester %d is: $ %.2f%nTotal fee till semester %d is: $ %.2f",
                toString(), sem, calcTotalScholarship(sem, preq, GPA), sem, calcTotalCost(sem, preq, GPA));
        return printReceipt;
    }

}
