packagecom.example.demo.service;
import java.util.List;
import com.example.demo.entity.Api;
public interface ApiService {
  public  Api createData(Api a);
   List<Api> fetchRecord();
}