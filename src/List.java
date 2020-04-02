public class List {
    private Node head;
    private Node last;
    //插入节点
    void insert(int data,int index){
        //判断index是否合理
        if (index>getLength()){
            throw new IndexOutOfBoundsException("超出链表节点范围");
        }
        var insertNode = new Node(data);

        if (getLength() == 0){  //空链表
            head = insertNode;
            last = insertNode;
        }else if(index == 0){   //头部插入
            insertNode.next = head;
            head = insertNode;
        }else if(index == getLength()){ //尾部插入
            last.next = insertNode;
            last = insertNode;
        }else {//中间插入
            Node prevNode = getIndex(index-1);
            insertNode.next = prevNode.next;
            prevNode.next = insertNode;
        }
    }
    //删除节点
    void delete(int index){
        if (index > getLength()){
            throw new IndexOutOfBoundsException("超出链表节点范围");
        }
        Node deleteNode = null;
        if (index == 0){    //删除头结点
            deleteNode = head;
            head = deleteNode.next;
        }else if (index == getLength()){    //尾部删除
            Node prevNode = getIndex(index-1);
            prevNode.next = null;
            last = prevNode;
        }else {
            Node prevNode = getIndex(index-1);
            Node node = getIndex(index);
            prevNode.next = node.next;
        }
    }
    //根据数据查找下标
    void getDataIndex(int data){
        Node node = head;
        for (int i = 0;i < getLength();i++){
            if (node.data == data){
                System.out.println(data+"在第"+i+"位");
                return;
            }
            node = node.next;
        }
        System.out.println("查无此数据");
    }
    //根据下标查找数据
    int getIndexData(int index){
        if (index > getLength()){
            throw new IndexOutOfBoundsException("超出链表节点范围");
        }
        Node node = getIndex(index);
        return node.data;
    }
    //修改数据
    void update(int index,int new_data){
        Node node = getIndex(index);
        node.data = new_data;
    }
    //获取指定位置的节点
    Node getIndex(int index){
        Node node = head;
        for (int i = 0;i < index;i++){
            node = node.next;
        }
        return node;
    }
    //获取链表长度
    int getLength(){
        int length = 0;
        Node node = head;
        while (node!=null){
            length++;
            node = node.next;
        }
        return length;
    }
    //打印链表
    void printList(){
        Node node = head;
        while (node!=null){
            System.out.println(node.data);
            node = node.next;
        }
    }
    //定义节点
    private static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
        }
    }

}
