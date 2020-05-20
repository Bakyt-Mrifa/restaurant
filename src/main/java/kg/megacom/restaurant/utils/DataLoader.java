package kg.megacom.restaurant.utils;

import kg.megacom.restaurant.database.StatusesRepo;
import kg.megacom.restaurant.models.domain.Statuses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

import static org.springframework.data.domain.ExampleMatcher.GenericPropertyMatchers.ignoreCase;

@Component
public class DataLoader {/*implements ApplicationRunner {
    private StatusesRepo statusesRepo1;
    @Autowired
    public DataLoader(StatusesRepo statusesRepo){
        this.statusesRepo1=statusesRepo;
    }
    @Override
    public void run(ApplicationArguments args) throws Exception {
        List<Statuses> statuses= Arrays.asList(
                new Statuses("Доступен"),
                new Statuses("Закрыт"),
                new Statuses("Не начат"),
                new Statuses("Определен победитель"));

        ExampleMatcher exampleMatcher=ExampleMatcher.matching().withIgnorePaths("id")
                .withMatcher("name", ignoreCase());
        statuses.stream()
                .forEach(x->{
                    if (!statusesRepo1.exists(Example.of(x,exampleMatcher))){
                        statusesRepo1.save(x);
                    }else {
                        System.out.println("Такой статус существует");
                    }
                });

    }*/

}
