
public class QuestionNode {
        private Question question;
        private QuestionNode next;
        private QuestionNode prev;

        public QuestionNode(Question question) {
            this.question = question;
            this.next = null;
            this.prev = null;
        }
        public Question getQuestion() {
            return question;
        }
        public QuestionNode getNext() {
            return next;
        }
        public void setNext(QuestionNode next) {
            this.next = next;
        }
        public QuestionNode getPrev() {
            return prev;
        }
        public void setPrev(QuestionNode prev) {
            this.prev = prev;
        }

    public void display(){

    }
}
