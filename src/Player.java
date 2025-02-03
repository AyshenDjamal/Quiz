public class Player {
    public String nameSurname;
    public int score = 0;
    public int chance = 3;

    Player(String nameSurname){
        this.nameSurname = nameSurname;
        System.out.println("Hello " + this.nameSurname);
    }

//    void setScore(int score){
//        this.score = score;
//        System.out.println("Your score is " + this.score);
//    }

//    void setChance(int chance){
//        this.chance = chance;
//        System.out.println("Your chance is updated");
//    }

    void endGame(String message){
        System.out.println("**************");
        System.out.println(message);
        System.out.println("Your score: "+this.score);
        System.out.println("Chances left: " +this.chance);
        System.out.println("****************");

    }

    void bonusPoints(int score){
        System.out.println("Congrats, it is correct!\n You gained points");
        this.score += score;
    }

    void penalty(){
        System.out.println("Sorry, it is not correct! \n Your chances are updated");
        this.chance --;
        if(this.chance <= 0) this.endGame("You haven't left any chance");
    }

}
