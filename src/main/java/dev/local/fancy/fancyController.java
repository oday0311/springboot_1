package dev.local.fancy;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by alex on 2017/3/4.
 */

@RestController
public class fancyController {
    @RequestMapping("/fancy")
    public fancy getFancy()
    {
        fancy f = new fancy();
        return f;
    }

}
