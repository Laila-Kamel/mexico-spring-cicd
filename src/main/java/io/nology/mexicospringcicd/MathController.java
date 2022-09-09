package io.nology.mexicospringcicd;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/math")
public class MathController {

	//Endpoints for shape functionality. ie area of circle
	///{shape}/{method}/{params}
	@GetMapping("/rectangle/area/{height}/{width}")
	public Integer rectangleArea(@PathVariable Integer height, @PathVariable Integer width) {
		return height*width;
	}
	@GetMapping("circle/perimeter/{r}")
	public Double circlePerimeter(@PathVariable Double r) {
		return 2*Math.PI*r;
	}
}
