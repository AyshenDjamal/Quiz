public class Quiz {
    public String question;
    public String optionA, optionB, optionC, optionD;
    public String correctAnswer;
    public int point;

    Quiz(String question, String optionA, String optionB, String optionC, String optionD, String correctAnswer, int point) {
        this.question = question;
        this.optionA = optionA;
        this.optionB = optionB;
        this.optionC = optionC;
        this.optionD = optionD;
        this.correctAnswer = correctAnswer;
        this.point = point;

    }

    void displayQuestions(int no){
        System.out.println(no+". Sual");
        System.out.println(this.question);
        System.out.println(optionA);
        System.out.println(optionB);
        System.out.println(optionC);
        System.out.println(optionD);
        System.out.println(point+ " points");
    }

    boolean isTrue(String answer) {
       return this.correctAnswer.equals(answer);
    }

}
