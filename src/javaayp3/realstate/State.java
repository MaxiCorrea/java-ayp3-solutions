package javaayp3.realstate;

public enum State {

  GOOD {
    @Override
    public String toString() {
      return "Bueno";
    }
  },
  REGULAR {
    @Override
    public String toString() {
      return "Regular";
    }
  },
  BAD {
    @Override
    public String toString() {
      return "Malo";
    }
  };

}
