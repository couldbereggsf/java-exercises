public class Box <T>{ //Our box class is set up to be reusable. We  can store all sort of different things within our box
    T item;
    public void setItem(T item){
        this.item = item;           //The item that we receive
    }

    public T getItem() {
        return item;
    }
    // We can put things in our box, and we can get things from our box using setters and getters.
}
