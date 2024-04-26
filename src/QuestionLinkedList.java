public class QuestionLinkedList {
    static QuestionNode head;
    static QuestionNode tail;
    QuestionLinkedList(){
        head = null;
        tail = null;
    }
    public void insertNode(Question question){
        QuestionNode node = new QuestionNode(question);
        if(head==null){
            head = node;
        }
        else {
            tail.setNext(node); //sets node that was last to point to new node
            node.setPrev(tail);
        }
        tail = node; //tail points to last node
    }
}