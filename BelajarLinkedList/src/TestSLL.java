class testNode {
    int data;
    testNode pointer;

    public testNode(int data) {
        this.data = data;
        pointer = null;
    }
}

public class TestSLL {
    testNode Start;

    void tambahDiBelakang (int data){

        testNode nodeBaru = new testNode(data);
        if (Start == null) {
            Start = nodeBaru;
            return;
        }

        Start.pointer = nodeBaru;


    }

    void cetakList () {
        testNode current = Start;

        while(current != null){
            System.out.print(current.data + " -> ");
            current = current.pointer;
        }
    }
}
