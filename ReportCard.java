package com.example.martyna.scholarshipproject_reportcard;

public class ReportCard {

    /**
     * Field for student's ID.
     */
    private int mStudentId;

    /**
     * Field for student's first name.
     */
    private String mStudentFirstName;

    /**
     * Field for student's last name.
     */
    private String mStudentLastName;

    /**
     * Field for student's grade in Mathematics.
     */
    private char mMathematicsGrade;

    /**
     * Field for student's grade in Chemistry.
     */
    private int mChemistryGrade;

    /**
     * Field for student's grade in History.
     */
    private double mHistoryGrade;

    /**
     * Create a new ReportCard object.
     *
     * @param studentId        is the ID of the student.
     * @param studentFirstName is the first name of the student.
     * @param studentLastName  is the last name of the student.
     * @param mathematicsGrade is student's grade in Mathematics.
     * @param chemistryGrade   is student's grade in Chemistry.
     * @param historyGrade     is student's grade in History.
     */

    public ReportCard(int studentId, String studentFirstName, String studentLastName, char mathematicsGrade, int chemistryGrade, double historyGrade) {
        mStudentId = studentId;
        mStudentFirstName = studentFirstName;
        mStudentLastName = studentLastName;
        mMathematicsGrade = mathematicsGrade;
        mChemistryGrade = chemistryGrade;
        mHistoryGrade = historyGrade;
    }

    /**
     * Get student's ID.
     */
    public int getStudentId() {
        return mStudentId;
    }

    /**
     * Set student's ID.
     */
    public void setStudentId(int studentId) {
        mStudentId = studentId;
    }

    /**
     * Get student's first name.
     */
    public String getStudentFirstName() {
        return mStudentFirstName;
    }

    /**
     * Set student's first name.
     */
    public void setStudentFirstName(String studentFirstName) {
        mStudentFirstName = studentFirstName;
    }

    /**
     * Get student's last name.
     */
    public String getStudentLastName() {
        return mStudentLastName;
    }

    /**
     * Set student's last name.
     */
    public void setStudentLastName(String studentLastName) {
        mStudentLastName = studentLastName;
    }

    /**
     * Get student's grade in Mathematics.
     */
    public char getMathematicsGrade() {
        return mMathematicsGrade;
    }

    /**
     * Set student's grade in Mathematics.
     */
    public void setMathematicsGrade(char mathematicsGrade) {
        mMathematicsGrade = mathematicsGrade;
    }

    /**
     * Get student's grade in Chemistry.
     */
    public int getChemistryGrade() {
        return mChemistryGrade;
    }

    /**
     * Set student's grade in Chemistry.
     */
    public void setChemistryGrade(int chemistryGrade) {
        mChemistryGrade = chemistryGrade;
    }

    /**
     * Get student's grade in History.
     */
    public double getHistoryGrade() {
        return mHistoryGrade;
    }

    /**
     * Set student's grade in History.
     */
    public void setHistoryGrade(double historyGrade) {
        mHistoryGrade = historyGrade;
    }

    @Override
    public String toString() {
        return "Student{ " +
                "\nID: " + mStudentId +
                "\nFirst name: " + mStudentFirstName +
                "\nLast name: " + mStudentLastName +
                "\nGrade in Mathematics: " + mMathematicsGrade +
                "\nGrade in Chemistry: " + mChemistryGrade +
                "\nGrade in History: " + mHistoryGrade + " }";

    }
}
