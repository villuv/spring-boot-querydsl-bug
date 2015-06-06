package villuv.springboot.querydsl.bug.app;

import com.querydsl.core.annotations.QueryEntity;

@QueryEntity
public class TheBean {
  private String value;

  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }
}
