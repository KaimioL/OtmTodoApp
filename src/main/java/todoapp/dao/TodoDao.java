package todoapp.dao;

import java.util.List;
import todoapp.domain.Todo;

public interface TodoDao {

    void create(Todo todo);

    List<Todo> getAll();

    void setDone(int id);

}