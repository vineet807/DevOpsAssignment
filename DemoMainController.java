@RestController
@RequestMapping("/heloo")
public class DemoMainController {
	
	@GetMapping(value = "/heloguest")
	public String hellWord() {
		return"Welcome Guest U are learning devOps"
	}

}
