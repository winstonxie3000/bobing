package bobing.backend.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BobingController {

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public ResponseEntity<?> getBobingList(int index) {

        return null;
    }

}
