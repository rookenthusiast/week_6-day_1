public class Pub{
  private String name;
  private Punter[] capacity;

  public Pub(String name){
    this.name = name;
    this.capacity = new Punter[20];
  }
  public String getName(){
    return this.name;
  }

  public int punterCount(){
    int count = 0;
    for (Punter punter : capacity){
      if (punter != null) {
        count ++;
      }
    }
    return count;
  }

  public void enter(Punter punter){
if (capacityFull()) {
  return;
  }
  int punterCount = punterCount();
  capacity[punterCount] = punter;
}

public boolean capacityFull(){
  return punterCount() == capacity.length;
}

public void close(){
  for (int i=0; i < capacity.length; i++) {
    capacity[i] = null;
  }
}
}