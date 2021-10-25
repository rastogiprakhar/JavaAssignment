package Advance.AdvQues1;

public class Dish {
    private long dishID;
    private String dishName;
    private String time;

    public Dish(long dishID, String dishName, String time) {
        this.dishID = dishID;
        this.dishName = dishName;
        this.time = time;
    }

    public long getDishID() {
        return dishID;
    }

    public String getDishName() {
        return dishName;
    }

    public String getTime() {
        return time;
    }

    @Override
    public String toString() {
        return "Dish{" +
                "dishID=" + dishID +
                ", dishName='" + dishName + '\'' +
                ", time='" + time + '\'' +
                '}';
    }
}
