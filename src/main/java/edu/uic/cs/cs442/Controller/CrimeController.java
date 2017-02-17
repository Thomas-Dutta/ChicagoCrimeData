package edu.uic.cs.cs442.Controller;

import edu.uic.cs.cs442.model.CrimeRecord;
import edu.uic.cs.cs442.repository.CrimeRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by thomasdutta on 2/16/17.
 */

@Controller
public class CrimeController {
    final static Logger logger = LoggerFactory.getLogger(CrimeController.class);

    @Autowired
    CrimeRepository crimeRepository;

    @RequestMapping(value = "/",  method = RequestMethod.GET)
    @ResponseBody
    public CrimeRecord getCrimeRecord()  {
        return crimeRepository.findOne("2104664");
    }
}
