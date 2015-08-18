public class PriorityQueue extends MyList{

    public void add(int i) {
        int index = 0;
        while(index < size()){
            if(PeekAt(index) >= i){
                break;
            }
            index++;
        }
        AddAt(index, i);
    }

    public int take() {
        return takeItemFromFront();
    }
}
