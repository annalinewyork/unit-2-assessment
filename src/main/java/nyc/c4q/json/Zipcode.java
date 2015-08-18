package nyc.c4q.json;

public class Zipcode {

    public String _id, city, state;
    public int pop;

    public Zipcode(String _id, String city, String state, int pop) {
        this._id = _id;
        this.city = city;
        this.state = state;
        this.pop = pop;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getPop() {
        return pop;
    }

    public void setPop(int pop) {
        this.pop = pop;
    }
}
