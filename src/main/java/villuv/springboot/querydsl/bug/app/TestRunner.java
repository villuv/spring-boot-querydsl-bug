package villuv.springboot.querydsl.bug.app;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

import static com.querydsl.collections.CollQueryFactory.from;

@Component
public class TestRunner implements CommandLineRunner {

  @Override
  public void run(String... strings) throws Exception {
    List<TheBean> beans = new ArrayList<>();
    QTheBean bean = new QTheBean("bean");
    List<TheBean> results = from(bean, beans).where(bean.value.eq("x")).fetch();
    results.stream().map(TheBean::getValue).forEach(System.out::println);
  }
}
