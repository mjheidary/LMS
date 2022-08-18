package util;

public enum BookEnumStatus {
  RETURN(1),
  BURROW(0);

  private final Integer status;

  BookEnumStatus(Integer status) {
    this.status = status;
  }

  public static BookEnumStatus findValue(Integer status){
    for (BookEnumStatus value:BookEnumStatus.values()){
      if (value.status.equals(status)){
        return value;
      }
    }
    return null;
  }

  public Integer getStatus() {
    return status;
  }
}
