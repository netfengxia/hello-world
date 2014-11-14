public class GdSearch4Keyword{
	String status;
	String count;
	String info;
	Suggestion suggestion;
	List<Pois> pois;
}

class Suggestion{
	String keywords;
	List<City> cities;
}

class City{
	String name;
	String num;
	String citycode;
	String adcode;
}

class Pois{
	String id;
	String name;
	String type;
	String address;
	String location;
	String tel;
	String distance;
	String biz_ext;
}

{
	"status":"1",
	"count":"985",
	"info":"OK",
	"suggestion":{"keywords":"","cities":""},
	"pois":[
		{"id":"B01370UHBY","name":"石家庄站","type":"交通设施服务;火车站;火车站","address":"","location":"114.482979,38.010557","tel":"","distance":"","biz_ext":""},
		{"id":"B013704EBH","name":"石家庄北站","type":"交通设施服务;火车站;火车站","address":"市庄路","location":"114.466654,38.065171","tel":"0311-87924012","distance":"","biz_ext":""},
		{"id":"B01370VVST","name":"石家庄站(南进站口)","type":"交通设施服务;火车站;火车站","address":"石家庄站2层","location":"114.484291,38.010165","tel":"","distance":"","biz_ext":""},
		{"id":"B0FFFE0HLH","name":"石家庄站(南出站口)","type":"交通设施服务;火车站;火车站","address":"京广西街附近","location":"114.481436,38.010111","tel":"","distance":"","biz_ext":""},
		{"id":"B0FFFE0CGS","name":"石家庄站(西进站口)","type":"交通设施服务;火车站;火车站","address":"京广西街附近","location":"114.481922,38.010640","tel":"","distance":"","biz_ext":""},
		{"id":"B0FFFE0CHI","name":"石家庄站(北出站口)","type":"交通设施服务;火车站;火车站","address":"京广西街附近","location":"114.481801,38.011574","tel":"","distance":"","biz_ext":""},
		{"id":"B01370VVSS","name":"石家庄站(北进站口)","type":"交通设施服务;火车站;火车站","address":"石家庄站2层","location":"114.484204,38.010795","tel":"","distance":"","biz_ext":""},
		{"id":"B01370XT8E","name":"石家庄站西广场(南出站口)","type":"交通设施服务;火车站;火车站","address":"新石中路与京广西街交口南行200米","location":"114.481477,38.010082","tel":"0311-80943070","distance":"","biz_ext":""},
		{"id":"B013700317","name":"石家庄客运总站","type":"交通设施服务;长途汽车站;长途汽车站","address":"裕华西路站前街81号","location":"114.487678,38.037172","tel":"0311-87025775","distance":"","biz_ext":""},
		{"id":"B01370Y3C6","name":"石家庄南站","type":"交通设施服务;火车站;火车站","address":"金利街20号","location":"114.498943,38.005462","tel":"0311-86011050","distance":"","biz_ext":""}
	]
}

第一步成功的,主要是换 '[]'为双引号.
jsonText="{\"status\":\"1\",\"count\":\"982\",\"info\":\"OK\",\"pois\":[{\"id\":\"B01370UHBY\",\"name\":\"石家庄站\",\"type\":\"交通设施服务;火车站;火车站\",\"address\":\"\",\"location\":\"114.482979,38.010557\",\"tel\":\"\",\"distance\":\"\",\"biz_ext\":\"\"},{\"id\":\"B013704EBH\",\"name\":\"石家庄北站\",\"type\":\"交通设施服务;火车站;火车站\",\"address\":\"市庄路\",\"location\":\"114.466654,38.065171\",\"tel\":\"0311-87924012\",\"distance\":\"\",\"biz_ext\":\"\"},{\"id\":\"B01370VVST\",\"name\":\"石家庄站(南进站口)\",\"type\":\"交通设施服务;火车站;火车站\",\"address\":\"石家庄站2层\",\"location\":\"114.484291,38.010165\",\"tel\":\"\",\"distance\":\"\",\"biz_ext\":\"\"},{\"id\":\"B0FFFE0HLH\",\"name\":\"石家庄站(南出站口)\",\"type\":\"交通设施服务;火车站;火车站\",\"address\":\"京广西街附近\",\"location\":\"114.481436,38.010111\",\"tel\":\"\",\"distance\":\"\",\"biz_ext\":\"\"},{\"id\":\"B0FFFE0CGS\",\"name\":\"石家庄站(西进站口)\",\"type\":\"交通设施服务;火车站;火车站\",\"address\":\"京广西街附近\",\"location\":\"114.481922,38.010640\",\"tel\":\"\",\"distance\":\"\",\"biz_ext\":\"\"},{\"id\":\"B0FFFE0CHI\",\"name\":\"石家庄站(北出站口)\",\"type\":\"交通设施服务;火车站;火车站\",\"address\":\"京广西街附近\",\"location\":\"114.481801,38.011574\",\"tel\":\"\",\"distance\":\"\",\"biz_ext\":\"\"},{\"id\":\"B01370VVSS\",\"name\":\"石家庄站(北进站口)\",\"type\":\"交通设施服务;火车站;火车站\",\"address\":\"石家庄站2层\",\"location\":\"114.484204,38.010795\",\"tel\":\"\",\"distance\":\"\",\"biz_ext\":\"\"},{\"id\":\"B01370XT8E\",\"name\":\"石家庄站西广场(南出站口)\",\"type\":\"交通设施服务;火车站;火车站\",\"address\":\"新石中路与京广西街交口南行200米\",\"location\":\"114.481477,38.010082\",\"tel\":\"0311-80943070\",\"distance\":\"\",\"biz_ext\":\"\"},{\"id\":\"B013700317\",\"name\":\"石家庄客运总站\",\"type\":\"交通设施服务;长途汽车站;长途汽车站\",\"address\":\"裕华西路站前街81号\",\"location\":\"114.487678,38.037172\",\"tel\":\"0311-87025775\",\"distance\":\"\",\"biz_ext\":\"\"},{\"id\":\"B01370Y3C6\",\"name\":\"石家庄南站\",\"type\":\"交通设施服务;火车站;火车站\",\"address\":\"金利街20号\",\"location\":\"114.498943,38.005462\",\"tel\":\"0311-86011050\",\"distance\":\"\",\"biz_ext\":\"\"}],\"suggestion\":{\"keywords\":\"\", \"cities\":[{\"name\":\"北京市\",\"num\":\"790\",\"citycode\":\"010\",\"adcode\":\"110000\"}]}}";

{"status":"1","count":"985","info":"OK","suggestion":{"keywords":"","cities":""},"pois":[{"id":"B01370UHBY","name":"石家庄站","type":"交通设施服务;火车站;火车站","address":"","location":"114.482979,38.010557","tel":"","distance":"","biz_ext":""},{"id":"B013704EBH","name":"石家庄北站","type":"交通设施服务;火车站;火车站","address":"市庄路","location":"114.466654,38.065171","tel":"0311-87924012","distance":"","biz_ext":""},{"id":"B01370VVST","name":"石家庄站(南进站口)","type":"交通设施服务;火车站;火车站","address":"石家庄站2层","location":"114.484291,38.010165","tel":"","distance":"","biz_ext":""},{"id":"B0FFFE0HLH","name":"石家庄站(南出站口)","type":"交通设施服务;火车站;火车站","address":"京广西街附近","location":"114.481436,38.010111","tel":"","distance":"","biz_ext":""},{"id":"B0FFFE0CGS","name":"石家庄站(西进站口)","type":"交通设施服务;火车站;火车站","address":"京广西街附近","location":"114.481922,38.010640","tel":"","distance":"","biz_ext":""},{"id":"B0FFFE0CHI","name":"石家庄站(北出站口)","type":"交通设施服务;火车站;火车站","address":"京广西街附近","location":"114.481801,38.011574","tel":"","distance":"","biz_ext":""},{"id":"B01370VVSS","name":"石家庄站(北进站口)","type":"交通设施服务;火车站;火车站","address":"石家庄站2层","location":"114.484204,38.010795","tel":"","distance":"","biz_ext":""},{"id":"B01370XT8E","name":"石家庄站西广场(南出站口)","type":"交通设施服务;火车站;火车站","address":"新石中路与京广西街交口南行200米","location":"114.481477,38.010082","tel":"0311-80943070","distance":"","biz_ext":""},{"id":"B013700317","name":"石家庄客运总站","type":"交通设施服务;长途汽车站;长途汽车站","address":"裕华西路站前街81号","location":"114.487678,38.037172","tel":"0311-87025775","distance":"","biz_ext":""},{"id":"B01370Y3C6","name":"石家庄南站","type":"交通设施服务;火车站;火车站","address":"金利街20号","location":"114.498943,38.005462","tel":"0311-86011050","distance":"","biz_ext":""}]}