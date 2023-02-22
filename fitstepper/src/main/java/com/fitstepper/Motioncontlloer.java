
public class Motioncontlloer{
 
    @Autowired
    private MotionRepository repository;

    @GetMapping(path = "/api/motion/getBuiList")
    public List<Bui> getBuiList(){
        return repository.findAll();
    }

    @GetMapping(path = "/api/motion/getEventList")
    public List<Event>getEventList(){
        return repository.findAll();
    }
    
}