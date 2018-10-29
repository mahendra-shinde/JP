public class MyDate {
  private int day;
  private int month;
  private int year;

  public MyDate(int day, int month, int year) {
    this.day   = day;
    this.month = month;
    this.year  = year;
  }
  public MyDate(MyDate date) {
    this.day   = date.day;
    this.month = date.month;
    this.year  = date.year;
  }

  public int getDay() {
    return day;
  }

  public void setDay(int day) {
    this.day = day;
  }

  public MyDate addDays(int more_days) {
    MyDate new_date = new MyDate(this);

    new_date.day = new_date.day + more_days;
    // Not Yet Implemented: wrap around code...

    return new_date;
  }
  public String toString() {
    return "" + day + "-" + month + "-" + year;
  }
}
