package cn.noload.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author hao.caosh@ttpai.cn
 * @date 2020-01-10 9:37
 */
@RestController
public class TestResource {

    @GetMapping("/api/{id}/test")
    public Map<String, Object> test(@PathVariable("id") Integer id) {
		Map<String, Object> response = new HashMap<>();
		response.put("code", 200);
        return response;
    }
}
