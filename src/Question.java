import java.util.ArrayList;

class Question {
    int ID;
    enum optType {DROP,RADIO,CHECK}
    optType t;
    int optNum;
    String questionText;
    ArrayList<String> qOptions;
    int[] respCounter;

    Question(int ID, int optNum){ //cannot initialize w/o this
        this.ID=ID;
        this.qOptions = new ArrayList<String>(optNum);
        this.respCounter = new int[optNum];
        this.t = optType.DROP;
        this.optNum = optNum;
        for(int i=0; i<optNum;i++){
            respCounter[i]=0;
        } //start the list of counters at 0
    }
    Question(int ID, int optNum, String questionText, optType t){ //completely create q
        this.ID=ID;
        this.qOptions = new ArrayList<String>(optNum);
        this.respCounter = new int[optNum];
        this.t = t;
        this.questionText = questionText;
        this.optNum = optNum;
        for(int i=0; i<optNum;i++){
            respCounter[i]=0;
        } //start the list of counters at 0
    }
    public optType getT() {
        return t;
    }
    public void setT(optType t) {
        this.t = t;
    }
    public String getQuestionText() {
        return questionText;
    }

    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }
    public void addOption(String x){
        qOptions.add(x);
    }

}


