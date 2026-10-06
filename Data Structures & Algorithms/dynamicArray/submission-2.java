class DynamicArray {
    int capacity;
    int[] dynamicArr;
    int size;


    public DynamicArray(int capacity) {
        this.capacity= capacity;
        dynamicArr = new int[capacity];
        this.size = 0;
    }

    public int get(int i) {
        return dynamicArr[i];

    }

    public void set(int i, int n) {
        dynamicArr[i] = n;
    }

    public void pushback(int n) {
        if(getSize() == getCapacity()){
            resize();
        }  
        set(getSize(),n);
        this.size+=1;
        
    }

    public int popback() {
        this.size-=1;
        return get(getSize());

    }

    private void resize() {
        this.capacity = 2 * getCapacity();
        
        int[] newDynamicArr = new int[this.capacity];
        for(int k =0; k < dynamicArr.length; k++){
        newDynamicArr[k] = dynamicArr[k];
        }
        dynamicArr = newDynamicArr;
       
    }

    public int getSize() {
        if(this.size <= 0)
        return 0;
        return (this.size) ;

    }

    public int getCapacity() {
        return this.capacity;

    }
}
