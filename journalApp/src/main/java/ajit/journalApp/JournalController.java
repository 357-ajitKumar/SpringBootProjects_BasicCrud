package ajit.journalApp;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/journal")
public class JournalController {

    private Map<Long,JournalEntry> journalEntryMap = new HashMap();

    @GetMapping
    public List<JournalEntry> getAll(){

        return new ArrayList<>(journalEntryMap.values());
    }

    @PostMapping
    public void createJournal(@RequestBody JournalEntry entry){

        journalEntryMap.put(entry.getId(),entry);

        return;

    }

    @GetMapping("id/{id}")
    public JournalEntry getById(@PathVariable Long id){
        return journalEntryMap.get(id);

    }

    @DeleteMapping("id/{id}")
    public void deleteJournal(@PathVariable Long id){

        journalEntryMap.remove(id);

    }

    @PutMapping("id/{id}")
    public JournalEntry updateJournal(@PathVariable Long id, @RequestBody JournalEntry newEntry){

         journalEntryMap.replace(id,newEntry);

        return journalEntryMap.get(id);


    }
}
