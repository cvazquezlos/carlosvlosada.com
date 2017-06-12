package carlosvlosada.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import carlosvlosada.service.CommentService;
import carlosvlosada.service.ItemService;
import carlosvlosada.service.PostService;
import carlosvlosada.service.UserService;

@Component
public class DataExamples {

	@Autowired
	private CommentService commentService;
	@Autowired
	private ItemService itemService;
	@Autowired
	private PostService postService;
	@Autowired
	private UserService userService;

	@SuppressWarnings("deprecation")
	@PostConstruct
	private void initDataBase() {

		Comment c1, c2, c3, c4;
		Item i1, i2, i3, i4, i5, i6;
		Post p1;
		User u1;

		c1 = new Comment("Richard", "richard@gmail.com", "Nice post!", new Date());
		commentService.save(c1);
		c2 = new Comment("Jake", "jake@gmail.com", "Nice post!", new Date());
		commentService.save(c2);
		c4 = new Comment("Jimmy", "jimmy@gmail.com", "Hey mate, can u help me?", new Date());
		commentService.save(c4);
		c3 = new Comment("Richard", "richard@gmail.com", "Nice post dude!", new Date());
		c3.getReplies().add(c4);
		commentService.save(c3);

		i1 = new Item("Binary Lab", "un trabajo sobre una página web estática", "10.png", "coding",
				"Binary Lab fue creada como una agencia de desarrollo web full stack, Android y diseño vectorial.");
		itemService.save(i1);
		i2 = new Item("Snake", "un clásico implementado con Java usando Patrones de Diseño", "09.png", "design",
				"Mis andaduras en el mundo tecnológico fueron cuando, de pequeño, jugué al Snake en esos antiguos"
						+ "y rudimentarios móviles de Nokia. Más de 15 años después, he logrado implementar ese juego que"
						+ "tanto marcó mi infancia y al que tantas horas eché.");
		itemService.save(i2);
		i3 = new Item("Lifez", "mi primera aplicación para dispositivos Android", "08.png", "design",
				"Hace más de un año, decidí aprender a programar aplicaciones Android, ya que mi afán de conocimi"
						+ "ento me obligó a ello. Hice esta sencilla aplicación, que consta de una sencilla transición de"
						+ "pantallas y está operativa en Google Play.");
		itemService.save(i3);
		i4 = new Item("marinahurtado.com", "un desarrollo web usando el framework WordPress", "07.png", "coding",
				"Marina Hurtado Alia es una bellísima persona que adora a los animales y los educa también. Vive"
						+ "fascinada por los perros y dedica gran parte de su tiempo a ellos. Decidí ayudarle haciéndole"
						+ "una página web para impulsar su futuro.");
		itemService.save(i4);
		i5 = new Item("Space Invaders", "otro clásico implementado, esta vez, con tecnología Android", "06.png",
				"android",
				"Esta fue mi segunda aplicación para Android que programé. Esta vez, se trataría de un"
						+ "juego con el que entretener a las personas aburridas. No se encuentra en Google Play pero pue"
						+ "des encontrarlo en mi GitHub y descargarlo.");
		itemService.save(i5);
		i6 = new Item("BREMS", "un desarrollo web full stack con Spring y Angular", "05.png", "coding",
				"BREMS fue un proyecto increíble, ya que pude realizarlo con otras increíbles personas. Se trata"
						+ "de una aplicación de gestión bibliotecaria para libros y revistas.");
		itemService.save(i6);

		u1 = new User("cvazquezlos", "1234tBc", "Software engineer and Data Scientist.", "c.vazquezlosada@gmail.com",
				new Date(1995, 5, 5));
		userService.save(u1);

		List<Object> content = new ArrayList<Object>();
		content.add("<h1>¡Bienvenidos!</h1>");
		content.add(
				"<p>En este blog podrás encontrar una grandísima cantidad de información relacionada con el <b>Data Science</b> (BI, Big Data, Machine Learning...) como de <b>Desarrollo Web</b>.</p>");
		p1 = new Post("Primer post", "p-01.png", new Date(), content, u1);
	}
}