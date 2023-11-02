package com.xworkz.app;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import com.xworkz.dto.CountryDTO;

public class CountryCollection {

	public static void main(String[] args) {

		CountryDTO country1 = new CountryDTO(1, "United States", "Washington, D.C.", 331000000, "July 4, 1776", 50,
				"Christianity", "Bald Eagle", "Bald Eagle", "American Football", "Joseph R. Biden Jr.");
		CountryDTO country2 = new CountryDTO(2, "United Kingdom", "London", 66040000, "July 4, 1776", 4, "Christianity",
				"Lion", "European Robin", "Cricket", "Boris Johnson");
		CountryDTO country3 = new CountryDTO(3, "India", "New Delhi", 1380004385, "August 15, 1947", 28, "Hinduism",
				"Bengal Tiger", "Indian Peafowl", "Cricket", "Narendra Modi");
		CountryDTO country4 = new CountryDTO(4, "Canada", "Ottawa", 37590000, "July 1, 1867", 13, "Christianity",
				"Beaver", "Common Loon", "Ice Hockey", "Justin Trudeau");
		CountryDTO country5 = new CountryDTO(5, "Australia", "Canberra", 25600000, "January 1, 1901", 6, "Christianity",
				"Kangaroo", "Emu", "Australian Rules Football", "Scott Morrison");
		CountryDTO country6 = new CountryDTO(6, "Brazil", "Brasília", 211000000, "September 7, 1822", 26,
				"Christianity", "Jaguar", "Blue-and-yellow Macaw", "Football (Soccer)", "Jair Bolsonaro");
		CountryDTO country7 = new CountryDTO(7, "China", "Beijing", 1439323776, "October 1, 1949", 23, "Atheism",
				"Giant Panda", "Red-crowned Crane", "Table Tennis", "Xi Jinping");
		CountryDTO country8 = new CountryDTO(8, "Russia", "Moscow", 146599183, "June 12, 1990", 85, "Christianity",
				"Brown Bear", "Double-headed Eagle", "Ice Hockey", "Vladimir Putin");
		CountryDTO country9 = new CountryDTO(9, "South Africa", "Pretoria", 59308690, "May 31, 1961", 9, "Christianity",
				"Springbok", "Blue Crane", "Rugby", "Cyril Ramaphosa");
		CountryDTO country10 = new CountryDTO(10, "Japan", "Tokyo", 126050000, "February 11, 660 BC", 47,
				"Shinto and Buddhism", "Sika Deer", "Green Pheasant", "Sumo Wrestling", "Fumio Kishida");
		CountryDTO country11 = new CountryDTO(11, "Mexico", "Mexico City", 126190788, "September 16, 1810", 32,
				"Christianity", "Golden Eagle", "Caracara", "Charrería", "Andrés Manuel López Obrador");
		CountryDTO country12 = new CountryDTO(12, "Egypt", "Cairo", 100388073, "February 28, 1922", 27, "Islam",
				"Nile Crocodile", "Steppe Eagle", "Football (Soccer)", "Abdel Fattah el-Sisi");
		CountryDTO country13 = new CountryDTO(13, "Germany", "Berlin", 83149300, "October 3, 1990", 16, "Christianity",
				"Bald Eagle", "European Robin", "Football (Soccer)", "Olaf Scholz");
		CountryDTO country14 = new CountryDTO(14, "France", "Paris", 67406000, "July 14, 1789", 18, "Christianity",
				"Gallic Rooster", "Common Kestrel", "Football (Soccer)", "Emmanuel Macron");
		CountryDTO country15 = new CountryDTO(15, "Italy", "Rome", 60390560, "June 2, 1946", 20, "Christianity",
				"Italian Wolf", "Italian Sparrow", "Football (Soccer)", "Mario Draghi");
		CountryDTO country16 = new CountryDTO(16, "Spain", "Madrid", 47100396, "December 6, 1978", 17, "Christianity",
				"Bull", "Spanish Imperial Eagle", "Football (Soccer)", "Pedro Sánchez");
		CountryDTO country17 = new CountryDTO(17, "Argentina", "Buenos Aires", 45195777, "July 9, 1816", 23,
				"Christianity", "Jaguar", "Rufous Hornero", "Football (Soccer)", "Alberto Fernández");
		CountryDTO country18 = new CountryDTO(18, "South Korea", "Seoul", 51811167, "August 15, 1945", 9, "Buddhism",
				"Siberian Tiger", "Korean Magpie", "Taekwondo", "Yoon Suk-yeol");
		CountryDTO country19 = new CountryDTO(19, "Brazil", "Brasília", 211000000, "September 7, 1822", 26,
				"Christianity", "Jaguar", "Blue-and-yellow Macaw", "Football (Soccer)", "Jair Bolsonaro");
		CountryDTO country20 = new CountryDTO(20, "Mexico", "Mexico City", 126190788, "September 16, 1810", 32,
				"Christianity", "Golden Eagle", "Caracara", "Charrería", "Andrés Manuel López Obrador");
		CountryDTO country21 = new CountryDTO(21, "Egypt", "Cairo", 100388073, "February 28, 1922", 27, "Islam",
				"Nile Crocodile", "Steppe Eagle", "Football (Soccer)", "Abdel Fattah el-Sisi");
		CountryDTO country22 = new CountryDTO(22, "Germany", "Berlin", 83149300, "October 3, 1990", 16, "Christianity",
				"Bald Eagle", "European Robin", "Football (Soccer)", "Olaf Scholz");
		CountryDTO country23 = new CountryDTO(23, "France", "Paris", 67406000, "July 14, 1789", 18, "Christianity",
				"Gallic Rooster", "Common Kestrel", "Football (Soccer)", "Emmanuel Macron");
		CountryDTO country24 = new CountryDTO(24, "Italy", "Rome", 60390560, "June 2, 1946", 20, "Christianity",
				"Italian Wolf", "Italian Sparrow", "Football (Soccer)", "Mario Draghi");
		CountryDTO country25 = new CountryDTO(25, "Spain", "Madrid", 47100396, "December 6, 1978", 17, "Christianity",
				"Bull", "Spanish Imperial Eagle", "Football (Soccer)", "Pedro Sánchez");
		CountryDTO country26 = new CountryDTO(26, "Argentina", "Buenos Aires", 45195777, "July 9, 1816", 23,
				"Christianity", "Jaguar", "Rufous Hornero", "Football (Soccer)", "Alberto Fernández");
		CountryDTO country27 = new CountryDTO(27, "South Korea", "Seoul", 51811167, "August 15, 1945", 9, "Buddhism",
				"Siberian Tiger", "Korean Magpie", "Taekwondo", "Yoon Suk-yeol");
		CountryDTO country28 = new CountryDTO(28, "Canada", "Ottawa", 37590000, "July 1, 1867", 13, "Christianity",
				"Beaver", "Common Loon", "Ice Hockey", "Justin Trudeau");
		CountryDTO country29 = new CountryDTO(29, "Australia", "Canberra", 25600000, "January 1, 1901", 6,
				"Christianity", "Kangaroo", "Emu", "Australian Rules Football", "Scott Morrison");
		CountryDTO country30 = new CountryDTO(30, "China", "Beijing", 1439323776, "October 1, 1949", 23, "Atheism",
				"Giant Panda", "Red-crowned Crane", "Table Tennis", "Xi Jinping");
		CountryDTO country31 = new CountryDTO(31, "Russia", "Moscow", 146599183, "June 12, 1990", 85, "Christianity",
				"Brown Bear", "Double-headed Eagle", "Ice Hockey", "Vladimir Putin");
		CountryDTO country32 = new CountryDTO(32, "South Africa", "Pretoria", 59308690, "May 31, 1961", 9,
				"Christianity", "Springbok", "Blue Crane", "Rugby", "Cyril Ramaphosa");
		CountryDTO country33 = new CountryDTO(33, "Japan", "Tokyo", 126050000, "February 11, 660 BC", 47,
				"Shinto and Buddhism", "Sika Deer", "Green Pheasant", "Sumo Wrestling", "Fumio Kishida");
		CountryDTO country34 = new CountryDTO(34, "Nigeria", "Abuja", 206139587, "October 1, 1960", 36,
				"Islam and Christianity", "African Lion", "Eagle", "Football (Soccer)", "Muhammadu Buhari");
		CountryDTO country35 = new CountryDTO(35, "Brazil", "Brasília", 211000000, "September 7, 1822", 26,
				"Christianity", "Jaguar", "Blue-and-yellow Macaw", "Football (Soccer)", "Jair Bolsonaro");
		CountryDTO country36 = new CountryDTO(36, "Mexico", "Mexico City", 126190788, "September 16, 1810", 32,
				"Christianity", "Golden Eagle", "Caracara", "Charrería", "Andrés Manuel López Obrador");
		CountryDTO country37 = new CountryDTO(37, "Greece", "Athens", 10724599, "March 25, 1821", 13, "Greek Orthodoxy",
				"Dolphin", "Little Owl", "Football (Soccer)", "Kyriakos Mitsotakis");
		CountryDTO country38 = new CountryDTO(38, "Thailand", "Bangkok", 69428524, "June 24, 1932", 76, "Buddhism",
				"Thai Elephant", "Siamese Fireback", "Muay Thai", "Prayuth Chan-o-cha");
		CountryDTO country39 = new CountryDTO(39, "Saudi Arabia", "Riyadh", 34813871, "September 23, 1932", 13, "Islam",
				"Arabian Oryx", "Falcon", "Football (Soccer)", "Salman bin Abdulaziz Al Saud");
		CountryDTO country40 = new CountryDTO(40, "Sweden", "Stockholm", 10230185, "June 6, 1523", 21,
				"Lutheran Christianity", "Moose", "Common Swift", "Ice Hockey", "Stefan Löfven");
		CountryDTO country41 = new CountryDTO(41, "Turkey", "Ankara", 84339067, "October 29, 1923", 81, "Islam",
				"Gray Wolf", "Turkish Starling", "Oil Wrestling (Yağlı Güreş)", "Recep Tayyip Erdoğan");
		CountryDTO country42 = new CountryDTO(42, "Netherlands", "Amsterdam", 17128000, "July 26, 1581", 12,
				"Christianity", "Lion", "Black-tailed Godwit", "Football (Soccer)", "Mark Rutte");
		CountryDTO country43 = new CountryDTO(43, "Indonesia", "Jakarta", 273523615, "August 17, 1945", 34, "Islam",
				"Komodo Dragon", "Javan Hawk-Eagle", "Badminton", "Joko Widodo");
		CountryDTO country44 = new CountryDTO(44, "Kenya", "Nairobi", 53771296, "December 12, 1963", 47, "Christianity",
				"Lion", "African Fish Eagle", "Athletics", "Uhuru Kenyatta");
		CountryDTO country45 = new CountryDTO(45, "Switzerland", "Bern", 8654622, "August 1, 1291", 26, "Christianity",
				"St. Bernard Dog", "Swiss Goldfinch", "Skiing", "Guy Parmelin");
		CountryDTO country46 = new CountryDTO(46, "Portugal", "Lisbon", 10196709, "December 1, 1640", 20,
				"Christianity", "Iberian Wolf", "Common Magpie", "Football (Soccer)", "António Costa");
		CountryDTO country47 = new CountryDTO(47, "Ghana", "Accra", 31072940, "March 6, 1957", 16, "Christianity",
				"Lion", "African Eagle", "Association Football (Soccer)", "Nana Akufo-Addo");
		CountryDTO country48 = new CountryDTO(48, "Iran", "Tehran", 83992949, "April 1, 1979", 31, "Islam",
				"Asiatic Cheetah", "Common Nightingale", "Wrestling", "Ebrahim Raisi");
		CountryDTO country49 = new CountryDTO(49, "New Zealand", "Wellington", 4822233, "February 6, 1840", 16,
				"Christianity", "Kiwi", "Kotuku (White Heron)", "Rugby Union", "Jacinda Ardern");
		CountryDTO country50 = new CountryDTO(50, "Nigeria", "Abuja", 206139587, "October 1, 1960", 36,
				"Islam and Christianity", "African Lion", "Eagle", "Football (Soccer)", "Muhammadu Buhari");
		CountryDTO country51 = new CountryDTO(51, "Russia", "Moscow", 146599183, "June 12, 1990", 85, "Christianity",
				"Brown Bear", "Double-headed Eagle", "Ice Hockey", "Vladimir Putin");
		CountryDTO country52 = new CountryDTO(52, "Turkey", "Ankara", 84339067, "October 29, 1923", 81, "Islam",
				"Gray Wolf", "Turkish Starling", "Oil Wrestling (Yağlı Güreş)", "Recep Tayyip Erdoğan");
		CountryDTO country53 = new CountryDTO(53, "Sweden", "Stockholm", 10230185, "June 6, 1523", 21,
				"Lutheran Christianity", "Moose", "Common Swift", "Ice Hockey", "Stefan Löfven");
		CountryDTO country54 = new CountryDTO(54, "Saudi Arabia", "Riyadh", 34813871, "September 23, 1932", 13, "Islam",
				"Arabian Oryx", "Falcon", "Football (Soccer)", "Salman bin Abdulaziz Al Saud");
		CountryDTO country55 = new CountryDTO(55, "Thailand", "Bangkok", 69428524, "June 24, 1932", 76, "Buddhism",
				"Thai Elephant", "Siamese Fireback", "Muay Thai", "Prayuth Chan-o-cha");
		CountryDTO country56 = new CountryDTO(56, "Netherlands", "Amsterdam", 17128000, "July 26, 1581", 12,
				"Christianity", "Lion", "Black-tailed Godwit", "Football (Soccer)", "Mark Rutte");
		CountryDTO country57 = new CountryDTO(57, "Greece", "Athens", 10724599, "March 25, 1821", 13, "Greek Orthodoxy",
				"Dolphin", "Little Owl", "Football (Soccer)", "Kyriakos Mitsotakis");
		CountryDTO country58 = new CountryDTO(58, "Indonesia", "Jakarta", 273523615, "August 17, 1945", 34, "Islam",
				"Komodo Dragon", "Javan Hawk-Eagle", "Badminton", "Joko Widodo");
		CountryDTO country59 = new CountryDTO(59, "Kenya", "Nairobi", 53771296, "December 12, 1963", 47, "Christianity",
				"Lion", "African Fish Eagle", "Athletics", "Uhuru Kenyatta");
		CountryDTO country60 = new CountryDTO(60, "Switzerland", "Bern", 8654622, "August 1, 1291", 26, "Christianity",
				"St. Bernard Dog", "Swiss Goldfinch", "Skiing", "Guy Parmelin");
		CountryDTO country61 = new CountryDTO(61, "Portugal", "Lisbon", 10196709, "December 1, 1640", 20,
				"Christianity", "Iberian Wolf", "Common Magpie", "Football (Soccer)", "António Costa");
		CountryDTO country62 = new CountryDTO(62, "Ireland", "Dublin", 4921500, "April 24, 1916", 26, "Christianity",
				"Irish Wolfhound", "European Robin", "Gaelic Football", "Micheál Martin");
		CountryDTO country63 = new CountryDTO(63, "Peru", "Lima", 32971854, "July 28, 1821", 25, "Christianity",
				"Vicuña", "Andean Cock-of-the-Rock", "Paso Horse", "Pedro Castillo");
		CountryDTO country64 = new CountryDTO(64, "Malaysia", "Kuala Lumpur", 32722760, "August 31, 1957", 13, "Islam",
				"Malayan Tiger", "Rhinoceros Hornbill", "Badminton", "Ismail Sabri Yaakob");
		CountryDTO country65 = new CountryDTO(65, "Vietnam", "Hanoi", 97338579, "September 2, 1945", 58, "Buddhism",
				"Water Buffalo", "Red-vented Bulbul", "Football (Soccer)", "Phạm Minh Chính");
		CountryDTO country66 = new CountryDTO(66, "Chile", "Santiago", 19116201, "September 18, 1810", 16,
				"Christianity", "Huemul", "Andean Condor", "Rodeo", "Sebastián Piñera");
		CountryDTO country67 = new CountryDTO(67, "Pakistan", "Islamabad", 225199937, "August 14, 1947", 4, "Islam",
				"Markhor", "Chukar Partridge", "Cricket", "Imran Khan");
		CountryDTO country68 = new CountryDTO(68, "Kenya", "Nairobi", 53771296, "December 12, 1963", 47, "Christianity",
				"Lion", "African Fish Eagle", "Athletics", "Uhuru Kenyatta");
		CountryDTO country69 = new CountryDTO(69, "Brazil", "Brasília", 211000000, "September 7, 1822", 26,
				"Christianity", "Jaguar", "Blue-and-yellow Macaw", "Football (Soccer)", "Jair Bolsonaro");
		CountryDTO country70 = new CountryDTO(70, "Mexico", "Mexico City", 126190788, "September 16, 1810", 32,
				"Christianity", "Golden Eagle", "Caracara", "Charrería", "Andrés Manuel López Obrador");
		CountryDTO country71 = new CountryDTO(71, "Egypt", "Cairo", 100388073, "February 28, 1922", 27, "Islam",
				"Nile Crocodile", "Steppe Eagle", "Football (Soccer)", "Abdel Fattah el-Sisi");
		CountryDTO country72 = new CountryDTO(72, "Germany", "Berlin", 83149300, "October 3, 1990", 16, "Christianity",
				"Bald Eagle", "European Robin", "Football (Soccer)", "Olaf Scholz");
		CountryDTO country73 = new CountryDTO(73, "France", "Paris", 67406000, "July 14, 1789", 18, "Christianity",
				"Gallic Rooster", "Common Kestrel", "Football (Soccer)", "Emmanuel Macron");
		CountryDTO country74 = new CountryDTO(74, "Italy", "Rome", 60390560, "June 2, 1946", 20, "Christianity",
				"Italian Wolf", "Italian Sparrow", "Football (Soccer)", "Mario Draghi");
		CountryDTO country75 = new CountryDTO(75, "Spain", "Madrid", 47100396, "December 6, 1978", 17, "Christianity",
				"Bull", "Spanish Imperial Eagle", "Football (Soccer)", "Pedro Sánchez");
		CountryDTO country76 = new CountryDTO(76, "Argentina", "Buenos Aires", 45195777, "July 9, 1816", 23,
				"Christianity", "Jaguar", "Rufous Hornero", "Football (Soccer)", "Alberto Fernández");
		CountryDTO country77 = new CountryDTO(77, "South Korea", "Seoul", 51811167, "August 15, 1945", 9, "Buddhism",
				"Siberian Tiger", "Korean Magpie", "Taekwondo", "Yoon Suk-yeol");
		CountryDTO country78 = new CountryDTO(78, "Canada", "Ottawa", 37590000, "July 1, 1867", 13, "Christianity",
				"Beaver", "Common Loon", "Ice Hockey", "Justin Trudeau");
		CountryDTO country79 = new CountryDTO(79, "Australia", "Canberra", 25600000, "January 1, 1901", 6,
				"Christianity", "Kangaroo", "Emu", "Australian Rules Football", "Scott Morrison");
		CountryDTO country80 = new CountryDTO(80, "China", "Beijing", 1439323776, "October 1, 1949", 23, "Atheism",
				"Giant Panda", "Red-crowned Crane", "Table Tennis", "Xi Jinping");
		CountryDTO country81 = new CountryDTO(81, "Russia", "Moscow", 146599183, "June 12, 1990", 85, "Christianity",
				"Brown Bear", "Double-headed Eagle", "Ice Hockey", "Vladimir Putin");
		CountryDTO country82 = new CountryDTO(82, "South Africa", "Pretoria", 59308690, "May 31, 1961", 9,
				"Christianity", "Springbok", "Blue Crane", "Rugby", "Cyril Ramaphosa");
		CountryDTO country83 = new CountryDTO(83, "Japan", "Tokyo", 126050000, "February 11, 660 BC", 47,
				"Shinto and Buddhism", "Sika Deer", "Green Pheasant", "Sumo Wrestling", "Fumio Kishida");
		CountryDTO country84 = new CountryDTO(84, "Nigeria", "Abuja", 206139587, "October 1, 1960", 36,
				"Islam and Christianity", "African Lion", "Eagle", "Football (Soccer)", "Muhammadu Buhari");
		CountryDTO country85 = new CountryDTO(85, "Russia", "Moscow", 146599183, "June 12, 1990", 85, "Christianity",
				"Brown Bear", "Double-headed Eagle", "Ice Hockey", "Vladimir Putin");
		CountryDTO country86 = new CountryDTO(86, "Turkey", "Ankara", 84339067, "October 29, 1923", 81, "Islam",
				"Gray Wolf", "Turkish Starling", "Oil Wrestling (Yağlı Güreş)", "Recep Tayyip Erdoğan");
		CountryDTO country87 = new CountryDTO(87, "Sweden", "Stockholm", 10230185, "June 6, 1523", 21,
				"Lutheran Christianity", "Moose", "Common Swift", "Ice Hockey", "Stefan Löfven");
		CountryDTO country88 = new CountryDTO(88, "Saudi Arabia", "Riyadh", 34813871, "September 23, 1932", 13, "Islam",
				"Arabian Oryx", "Falcon", "Football (Soccer)", "Salman bin Abdulaziz Al Saud");
		CountryDTO country89 = new CountryDTO(89, "Thailand", "Bangkok", 69428524, "June 24, 1932", 76, "Buddhism",
				"Thai Elephant", "Siamese Fireback", "Muay Thai", "Prayuth Chan-o-cha");
		CountryDTO country90 = new CountryDTO(90, "Netherlands", "Amsterdam", 17128000, "July 26, 1581", 12,
				"Christianity", "Lion", "Black-tailed Godwit", "Football (Soccer)", "Mark Rutte");
		CountryDTO country91 = new CountryDTO(91, "Indonesia", "Jakarta", 273523615, "August 17, 1945", 34, "Islam",
				"Komodo Dragon", "Javan Hawk-Eagle", "Badminton", "Joko Widodo");
		CountryDTO country92 = new CountryDTO(92, "Ghana", "Accra", 31072940, "March 6, 1957", 16, "Christianity",
				"Lion", "African Eagle", "Association Football (Soccer)", "Nana Akufo-Addo");
		CountryDTO country93 = new CountryDTO(93, "Iran", "Tehran", 83992949, "April 1, 1979", 31, "Islam",
				"Asiatic Cheetah", "Common Nightingale", "Wrestling", "Ebrahim Raisi");
		CountryDTO country94 = new CountryDTO(94, "New Zealand", "Wellington", 4822233, "February 6, 1840", 16,
				"Christianity", "Kiwi", "Kotuku (White Heron)", "Rugby Union", "Jacinda Ardern");
		CountryDTO country95 = new CountryDTO(95, "Ireland", "Dublin", 4921500, "April 24, 1916", 26, "Christianity",
				"Irish Wolfhound", "European Robin", "Gaelic Football", "Micheál Martin");
		CountryDTO country96 = new CountryDTO(96, "Peru", "Lima", 32971854, "July 28, 1821", 25, "Christianity",
				"Vicuña", "Andean Cock-of-the-Rock", "Paso Horse", "Pedro Castillo");
		CountryDTO country97 = new CountryDTO(97, "Malaysia", "Kuala Lumpur", 32722760, "August 31, 1957", 13, "Islam",
				"Malayan Tiger", "Rhinoceros Hornbill", "Badminton", "Ismail Sabri Yaakob");
		CountryDTO country98 = new CountryDTO(98, "Vietnam", "Hanoi", 97338579, "September 2, 1945", 58, "Buddhism",
				"Water Buffalo", "Red-vented Bulbul", "Football (Soccer)", "Phạm Minh Chính");
		CountryDTO country99 = new CountryDTO(99, "Chile", "Santiago", 19116201, "September 18, 1810", 16,
				"Christianity", "Huemul", "Andean Condor", "Rodeo", "Sebastián Piñera");
		CountryDTO country100 = new CountryDTO(100, "Colombia", "Bogotá", 50882891, "July 20, 1810", 32, "Christianity",
				"Andean Condor", "Andean Condor", "Tejo", "Iván Duque Márquez");
		CountryDTO country101 = new CountryDTO(101, "Austria", "Vienna", 8902600, "October 26, 1955", 9, "Christianity",
				"Eagle", "Barn Swallow", "Association Football (Soccer)", "Karl Nehammer");
		CountryDTO country102 = new CountryDTO(102, "Belgium", "Brussels", 11632355, "July 21, 1831", 14,
				"Christianity", "Lion", "European Goldfinch", "Football (Soccer)", "Alexander De Croo");
		CountryDTO country103 = new CountryDTO(103, "South Sudan", "Juba", 11296359, "July 9, 2011", 12, "Christianity",
				"African Lion", "African Fish Eagle", "Football (Soccer)", "Salva Kiir Mayardit");
		CountryDTO country104 = new CountryDTO(104, "Vietnam", "Hanoi", 97338579, "September 2, 1945", 58, "Buddhism",
				"Water Buffalo", "Red-vented Bulbul", "Football (Soccer)", "Phạm Minh Chính");
		CountryDTO country105 = new CountryDTO(105, "Poland", "Warsaw", 38342576, "November 11, 1918", 23,
				"Christianity", "White Eagle", "White Stork", "Football (Soccer)", "Mateusz Morawiecki");
		CountryDTO country106 = new CountryDTO(106, "Algeria", "Algiers", 43851044, "July 5, 1962", 50, "Islam",
				"Fennec Fox", "Booted Eagle", "Association Football (Soccer)", "Abdelmadjid Tebboune");
		CountryDTO country107 = new CountryDTO(107, "Austria", "Vienna", 8902600, "October 26, 1955", 9, "Christianity",
				"Austrian Eagle", "Barn Swallow", "Association Football (Soccer)", "Karl Nehammer");
		CountryDTO country108 = new CountryDTO(108, "Ghana", "Accra", 31072940, "March 6, 1957", 16, "Christianity",
				"Lion", "African Eagle", "Association Football (Soccer)", "Nana Akufo-Addo");
		CountryDTO country109 = new CountryDTO(109, "Ukraine", "Kyiv", 44622516, "August 24, 1991", 27, "Christianity",
				"Grey Wolf", "Common Nightingale", "Football (Soccer)", "Volodymyr Zelensky");
		CountryDTO country110 = new CountryDTO(110, "Sweden", "Stockholm", 10230185, "June 6, 1523", 21,
				"Lutheran Christianity", "Moose", "Common Swift", "Ice Hockey", "Stefan Löfven");
		CountryDTO country111 = new CountryDTO(111, "Ireland", "Dublin", 4921500, "April 24, 1916", 26, "Christianity",
				"Irish Wolfhound", "European Robin", "Gaelic Football", "Micheál Martin");
		CountryDTO country112 = new CountryDTO(112, "Norway", "Oslo", 5367580, "May 17, 1814", 16, "Christianity",
				"Lion", "Common Loon", "Skiing", "Erna Solberg");
		CountryDTO country113 = new CountryDTO(113, "Denmark", "Copenhagen", 5822763, "June 5, 1849", 13,
				"Christianity", "Mute Swan", "European Robin", "Handball", "Mette Frederiksen");
		CountryDTO country114 = new CountryDTO(114, "Belgium", "Brussels", 11539328, "July 21, 1831", 23,
				"Christianity", "Lion", "European Robin", "Association Football (Soccer)", "Alexander De Croo");
		CountryDTO country115 = new CountryDTO(115, "Singapore", "Singapore", 5703569, "September 16, 1963", 4,
				"Buddhism", "Merlion", "Crimson Sunbird", "Table Tennis", "Lee Hsien Loong");
		CountryDTO country116 = new CountryDTO(116, "Iceland", "Reykjavik", 356991, "June 17, 1944", 13, "Christianity",
				"Gyrfalcon", "Redwing", "Handball", "Katrin Jakobsdottir");
		CountryDTO country117 = new CountryDTO(117, "Switzerland", "Bern", 8654622, "August 1, 1291", 26,
				"Christianity", "St. Bernard Dog", "Swiss Goldfinch", "Skiing", "Guy Parmelin");
		CountryDTO country118 = new CountryDTO(118, "Greece", "Athens", 10724599, "March 25, 1821", 13,
				"Greek Orthodoxy", "Dolphin", "Little Owl", "Football (Soccer)", "Kyriakos Mitsotakis");
		CountryDTO country119 = new CountryDTO(119, "Thailand", "Bangkok", 69428524, "June 24, 1932", 76, "Buddhism",
				"Thai Elephant", "Siamese Fireback", "Muay Thai", "Prayuth Chan-o-cha");
		CountryDTO country120 = new CountryDTO(120, "Saudi Arabia", "Riyadh", 34813871, "September 23, 1932", 13,
				"Islam", "Arabian Oryx", "Falcon", "Football (Soccer)", "Salman bin Abdulaziz Al Saud");
		CountryDTO country121 = new CountryDTO(121, "Norway", "Oslo", 5468110, "May 17, 1814", 16, "Christianity",
				"Lion", "White-throated Dipper", "Cross-country skiing", "Erna Solberg");
		CountryDTO country122 = new CountryDTO(122, "Peru", "Lima", 32971854, "July 28, 1821", 25, "Christianity",
				"Vicuña", "Andean Cock-of-the-Rock", "Paso Horse", "Pedro Castillo");
		CountryDTO country123 = new CountryDTO(123, "Malaysia", "Kuala Lumpur", 32722760, "August 31, 1957", 13,
				"Islam", "Malayan Tiger", "Rhinoceros Hornbill", "Badminton", "Ismail Sabri Yaakob");
		CountryDTO country124 = new CountryDTO(124, "Vietnam", "Hanoi", 97338579, "September 2, 1945", 58, "Buddhism",
				"Water Buffalo", "Red-vented Bulbul", "Football (Soccer)", "Phạm Minh Chính");
		CountryDTO country125 = new CountryDTO(125, "Chile", "Santiago", 19116201, "September 18, 1810", 16,
				"Christianity", "Huemul", "Andean Condor", "Rodeo", "Sebastián Piñera");
		CountryDTO country126 = new CountryDTO(126, "Netherlands", "Amsterdam", 17128000, "July 26, 1581", 12,
				"Christianity", "Lion", "Black-tailed Godwit", "Football (Soccer)", "Mark Rutte");
		CountryDTO country127 = new CountryDTO(127, "Greece", "Athens", 10724599, "March 25, 1821", 13,
				"Greek Orthodoxy", "Dolphin", "Little Owl", "Football (Soccer)", "Kyriakos Mitsotakis");
		CountryDTO country128 = new CountryDTO(128, "Indonesia", "Jakarta", 273523615, "August 17, 1945", 34, "Islam",
				"Komodo Dragon", "Javan Hawk-Eagle", "Badminton", "Joko Widodo");
		CountryDTO country129 = new CountryDTO(129, "Kenya", "Nairobi", 53771296, "December 12, 1963", 47,
				"Christianity", "Lion", "African Fish Eagle", "Athletics", "Uhuru Kenyatta");
		CountryDTO country130 = new CountryDTO(130, "Switzerland", "Bern", 8654622, "August 1, 1291", 26,
				"Christianity", "St. Bernard Dog", "Swiss Goldfinch", "Skiing", "Guy Parmelin");
		CountryDTO country131 = new CountryDTO(131, "Portugal", "Lisbon", 10196709, "December 1, 1640", 20,
				"Christianity", "Iberian Wolf", "Common Magpie", "Football (Soccer)", "António Costa");
		CountryDTO country132 = new CountryDTO(132, "Ireland", "Dublin", 4921500, "April 24, 1916", 26, "Christianity",
				"Irish Wolfhound", "European Robin", "Gaelic Football", "Micheál Martin");
		CountryDTO country133 = new CountryDTO(133, "Peru", "Lima", 32971854, "July 28, 1821", 25, "Christianity",
				"Vicuña", "Andean Cock-of-the-Rock", "Paso Horse", "Pedro Castillo");
		CountryDTO country134 = new CountryDTO(134, "Malaysia", "Kuala Lumpur", 32722760, "August 31, 1957", 13,
				"Islam", "Malayan Tiger", "Rhinoceros Hornbill", "Badminton", "Ismail Sabri Yaakob");
		CountryDTO country135 = new CountryDTO(135, "Vietnam", "Hanoi", 97338579, "September 2, 1945", 58, "Buddhism",
				"Water Buffalo", "Red-vented Bulbul", "Football (Soccer)", "Phạm Minh Chính");
		CountryDTO country136 = new CountryDTO(136, "Chile", "Santiago", 19116201, "September 18, 1810", 16,
				"Christianity", "Huemul", "Andean Condor", "Rodeo", "Sebastián Piñera");
		CountryDTO country137 = new CountryDTO(137, "Pakistan", "Islamabad", 225199937, "August 14, 1947", 4, "Islam",
				"Markhor", "Chukar Partridge", "Cricket", "Imran Khan");
		CountryDTO country138 = new CountryDTO(138, "Bangladesh", "Dhaka", 164669751, "March 26, 1971", 0, "Islam",
				"Royal Bengal Tiger", "Oriental Magpie-Robin", "Cricket", "Sheikh Hasina");
		CountryDTO country139 = new CountryDTO(139, "Colombia", "Bogotá", 50882891, "July 20, 1810", 7, "Christianity",
				"Andean Condor", "Yellow-eared Parrot", "Tejo", "Iván Duque Márquez");
		CountryDTO country140 = new CountryDTO(140, "Philippines", "Manila", 113229133, "June 12, 1898", 7,
				"Christianity", "Carabao", "Philippine Eagle", "Basketball", "Rodrigo Duterte");
		CountryDTO country141 = new CountryDTO(141, "Netherlands", "Amsterdam", 17128000, "July 26, 1581", 12,
				"Christianity", "Lion", "Black-tailed Godwit", "Football (Soccer)", "Mark Rutte");
		CountryDTO country142 = new CountryDTO(142, "Sweden", "Stockholm", 10230185, "June 6, 1523", 21,
				"Lutheran Christianity", "Moose", "Common Swift", "Ice Hockey", "Stefan Löfven");
		CountryDTO country143 = new CountryDTO(143, "Saudi Arabia", "Riyadh", 34813871, "September 23, 1932", 13,
				"Islam", "Arabian Oryx", "Falcon", "Football (Soccer)", "Salman bin Abdulaziz Al Saud");
		CountryDTO country144 = new CountryDTO(144, "Thailand", "Bangkok", 69428524, "June 24, 1932", 76, "Buddhism",
				"Thai Elephant", "Siamese Fireback", "Muay Thai", "Prayuth Chan-o-cha");
		CountryDTO country145 = new CountryDTO(145, "Greece", "Athens", 10724599, "March 25, 1821", 13,
				"Greek Orthodoxy", "Dolphin", "Little Owl", "Football (Soccer)", "Kyriakos Mitsotakis");
		CountryDTO country146 = new CountryDTO(146, "Indonesia", "Jakarta", 273523615, "August 17, 1945", 34, "Islam",
				"Komodo Dragon", "Javan Hawk-Eagle", "Badminton", "Joko Widodo");
		CountryDTO country147 = new CountryDTO(147, "Kenya", "Nairobi", 53771296, "December 12, 1963", 47,
				"Christianity", "Lion", "African Fish Eagle", "Athletics", "Uhuru Kenyatta");
		CountryDTO country148 = new CountryDTO(148, "Switzerland", "Bern", 8654622, "August 1, 1291", 26,
				"Christianity", "St. Bernard Dog", "Swiss Goldfinch", "Skiing", "Guy Parmelin");
		CountryDTO country149 = new CountryDTO(149, "Portugal", "Lisbon", 10196709, "December 1, 1640", 20,
				"Christianity", "Iberian Wolf", "Common Magpie", "Football (Soccer)", "António Costa");
		CountryDTO country150 = new CountryDTO(150, "Ireland", "Dublin", 4921500, "April 24, 1916", 26, "Christianity",
				"Irish Wolfhound", "European Robin", "Gaelic Football", "Micheál Martin");
		CountryDTO country151 = new CountryDTO(151, "Peru", "Lima", 32971854, "July 28, 1821", 25, "Christianity",
				"Vicuña", "Andean Cock-of-the-Rock", "Paso Horse", "Pedro Castillo");
		CountryDTO country152 = new CountryDTO(152, "Malaysia", "Kuala Lumpur", 32722760, "August 31, 1957", 13,
				"Islam", "Malayan Tiger", "Rhinoceros Hornbill", "Badminton", "Ismail Sabri Yaakob");
		CountryDTO country153 = new CountryDTO(153, "Vietnam", "Hanoi", 97338579, "September 2, 1945", 58, "Buddhism",
				"Water Buffalo", "Red-vented Bulbul", "Football (Soccer)", "Phạm Minh Chính");
		CountryDTO country154 = new CountryDTO(154, "Chile", "Santiago", 19116201, "September 18, 1810", 16,
				"Christianity", "Huemul", "Andean Condor", "Rodeo", "Sebastián Piñera");
		CountryDTO country155 = new CountryDTO(155, "Pakistan", "Islamabad", 225199937, "August 14, 1947", 4, "Islam",
				"Markhor", "Chukar Partridge", "Cricket", "Imran Khan");
		CountryDTO country156 = new CountryDTO(156, "Kenya", "Nairobi", 53771296, "December 12, 1963", 47,
				"Christianity", "Lion", "African Fish Eagle", "Athletics", "Uhuru Kenyatta");
		CountryDTO country157 = new CountryDTO(157, "Brazil", "Brasília", 211000000, "September 7, 1822", 26,
				"Christianity", "Jaguar", "Blue-and-yellow Macaw", "Football (Soccer)", "Jair Bolsonaro");
		CountryDTO country158 = new CountryDTO(158, "Mexico", "Mexico City", 126190788, "September 16, 1810", 32,
				"Christianity", "Golden Eagle", "Caracara", "Charrería", "Andrés Manuel López Obrador");
		CountryDTO country159 = new CountryDTO(159, "Egypt", "Cairo", 100388073, "February 28, 1922", 27, "Islam",
				"Nile Crocodile", "Steppe Eagle", "Football (Soccer)", "Abdel Fattah el-Sisi");
		CountryDTO country160 = new CountryDTO(160, "Germany", "Berlin", 83149300, "October 3, 1990", 16,
				"Christianity", "Bald Eagle", "European Robin", "Football (Soccer)", "Olaf Scholz");
		CountryDTO country161 = new CountryDTO(161, "France", "Paris", 67406000, "July 14, 1789", 18, "Christianity",
				"Gallic Rooster", "Common Kestrel", "Football (Soccer)", "Emmanuel Macron");
		CountryDTO country162 = new CountryDTO(162, "Italy", "Rome", 60390560, "June 2, 1946", 20, "Christianity",
				"Italian Wolf", "Italian Sparrow", "Football (Soccer)", "Mario Draghi");
		CountryDTO country163 = new CountryDTO(163, "Spain", "Madrid", 47100396, "December 6, 1978", 17, "Christianity",
				"Bull", "Spanish Imperial Eagle", "Football (Soccer)", "Pedro Sánchez");
		CountryDTO country164 = new CountryDTO(164, "Argentina", "Buenos Aires", 45195777, "July 9, 1816", 23,
				"Christianity", "Jaguar", "Rufous Hornero", "Football (Soccer)", "Alberto Fernández");
		CountryDTO country165 = new CountryDTO(165, "South Korea", "Seoul", 51811167, "August 15, 1945", 9, "Buddhism",
				"Siberian Tiger", "Korean Magpie", "Taekwondo", "Yoon Suk-yeol");
		CountryDTO country166 = new CountryDTO(166, "Canada", "Ottawa", 37590000, "July 1, 1867", 13, "Christianity",
				"Beaver", "Common Loon", "Ice Hockey", "Justin Trudeau");
		CountryDTO country167 = new CountryDTO(167, "Australia", "Canberra", 25600000, "January 1, 1901", 6,
				"Christianity", "Kangaroo", "Emu", "Australian Rules Football", "Scott Morrison");
		CountryDTO country168 = new CountryDTO(168, "China", "Beijing", 1439323776, "October 1, 1949", 23, "Atheism",
				"Giant Panda", "Red-crowned Crane", "Table Tennis", "Xi Jinping");
		CountryDTO country169 = new CountryDTO(169, "Russia", "Moscow", 146599183, "June 12, 1990", 85, "Christianity",
				"Brown Bear", "Double-headed Eagle", "Ice Hockey", "Vladimir Putin");
		CountryDTO country170 = new CountryDTO(170, "South Africa", "Pretoria", 59308690, "May 31, 1961", 9,
				"Christianity", "Springbok", "Blue Crane", "Rugby", "Cyril Ramaphosa");
		CountryDTO country171 = new CountryDTO(171, "Japan", "Tokyo", 126050000, "February 11, 660 BC", 47,
				"Shinto and Buddhism", "Sika Deer", "Green Pheasant", "Sumo Wrestling", "Fumio Kishida");
		CountryDTO country172 = new CountryDTO(172, "Nigeria", "Abuja", 206139587, "October 1, 1960", 10,
				"Islam and Christianity", "African Lion", "Eagle", "Football (Soccer)", "Muhammadu Buhari");
		CountryDTO country173 = new CountryDTO(173, "Greece", "Athens", 10423054, "March 25, 1821", 11, "Christianity",
				"Dolphin", "Seagull", "Basketball", "Kyriakos Mitsotakis");
		CountryDTO country174 = new CountryDTO(174, "Thailand", "Bangkok", 69427153, "December 10, 1932", 6, "Buddhism",
				"Elephant", "Siamese Fireback", "Muay Thai", "Prayuth Chan-o-cha");
		CountryDTO country175 = new CountryDTO(175, "Turkey", "Ankara", 82003882, "October 29, 1923", 11, "Islam",
				"Gray Wolf", "Turkish Eagle", "Oil Wrestling", "Recep Tayyip Erdoğan");
		CountryDTO country176 = new CountryDTO(176, "Sweden", "Stockholm", 10255132, "June 6, 1523", 9, "Christianity",
				"Elk", "Common Blackbird", "Ice Hockey", "Stefan Löfven");
		CountryDTO country177 = new CountryDTO(177, "Norway", "Oslo", 5377484, "May 17, 1814", 6, "Christianity",
				"Norwegian Forest Cat", "White-throated Dipper", "Cross-country Skiing", "Erna Solberg");
		CountryDTO country178 = new CountryDTO(178, "Denmark", "Copenhagen", 5822763, "June 5, 1849", 3, "Christianity",
				"Mute Swan", "Common Blackbird", "Handball", "Mette Frederiksen");
		CountryDTO country179 = new CountryDTO(179, "Switzerland", "Bern", 8654622, "August 1, 1291", 4, "Christianity",
				"Swiss Shepherd Dog", "Mute Swan", "Skiing", "Guy Parmelin");
		CountryDTO country180 = new CountryDTO(180, "Austria", "Vienna", 9006398, "October 26, 1955", 9, "Christianity",
				"Eagle", "Barn Swallow", "Skiing", "Karl Nehammer");
		CountryDTO country181 = new CountryDTO(181, "India", "New Delhi", 1380004385, "August 15, 1947", 29, "Hinduism",
				"Bengal Tiger", "Indian Peafowl", "Cricket", "Narendra Modi");
		CountryDTO country182 = new CountryDTO(182, "Indonesia", "Jakarta", 273523615, "August 17, 1945", 18, "Islam",
				"Komodo Dragon", "Javan Hawk-Eagle", "Badminton", "Joko Widodo");
		CountryDTO country183 = new CountryDTO(183, "Netherlands", "Amsterdam", 17181084, "July 26, 1581", 12,
				"Christianity", "Lion", "Black-tailed Godwit", "Football (Soccer)", "Mark Rutte");
		CountryDTO country184 = new CountryDTO(184, "Belgium", "Brussels", 11549896, "July 21, 1831", 3, "Christianity",
				"Lion", "European Goldfinch", "Cycling", "Alexander De Croo");
		CountryDTO country185 = new CountryDTO(185, "Portugal", "Lisbon", 10276617, "December 1, 1640", 7,
				"Christianity", "Iberian Wolf", "Barcelos Rooster", "Football (Soccer)", "António Costa");
		CountryDTO country186 = new CountryDTO(186, "Ireland", "Dublin", 4977400, "April 24, 1916", 2, "Christianity",
				"Red Deer", "European Robin", "Gaelic Football", "Micheál Martin");
		CountryDTO country187 = new CountryDTO(187, "Poland", "Warsaw", 38420687, "November 11, 1918", 16,
				"Christianity", "European Bison", "White-tailed Eagle", "Football (Soccer)", "Mateusz Morawiecki");
		CountryDTO country188 = new CountryDTO(188, "Ukraine", "Kyiv", 44622516, "August 24, 1991", 24, "Christianity",
				"European Bison", "White-tailed Eagle", "Football (Soccer)", "Volodymyr Zelenskyy");
		CountryDTO country189 = new CountryDTO(189, "Hungary", "Budapest", 9778300, "March 15, 1848", 4, "Christianity",
				"Turul Hawk", "European Roller", "Water Polo", "Viktor Orbán");
		CountryDTO country190 = new CountryDTO(190, "Czech Republic", "Prague", 10693939, "January 1, 1993", 10,
				"Christianity", "Double-tailed Lion", "Common Nightingale", "Ice Hockey", "Andrej Babiš");
		CountryDTO country191 = new CountryDTO(191, "New Zealand", "Wellington", 4822233, "February 6, 1840", 3,
				"Christianity", "Kiwi", "Fantail", "Rugby Union", "Jacinda Ardern");
		CountryDTO country192 = new CountryDTO(192, "Egypt", "Cairo", 104258327, "February 28, 1922", 3, "Islam",
				"Nile Crocodile", "Steppe Eagle", "Football (Soccer)", "Abdel Fattah el-Sisi");
		CountryDTO country193 = new CountryDTO(193, "Argentina", "Buenos Aires", 45195777, "July 9, 1816", 6,
				"Christianity", "Puma", "Rufous Hornero", "Football", "Alberto Fernández");
		CountryDTO country194 = new CountryDTO(194, "South Korea", "Seoul", 51780579, "August 15, 1945", 4,
				"Buddhism and Christianity", "Siberian Tiger", "Korean Magpie", "Taekwondo", "Yoon Suk-yeol");
		CountryDTO country195 = new CountryDTO(195, "Peru", "Lima", 33091507, "July 28, 1821", 3, "Christianity",
				"Vicuña", "Andean Cock-of-the-rock", "Volleyball", "Pedro Castillo");

		Collection<CountryDTO> countries = new ArrayList<CountryDTO>();

		countries.add(country1);
		countries.add(country2);
		countries.add(country3);
		countries.add(country4);
		countries.add(country5);
		countries.add(country6);
		countries.add(country7);

		countries.add(country8);
		countries.add(country9);
		countries.add(country10);
		countries.add(country11);
		countries.add(country12);
		countries.add(country13);
		countries.add(country14);
		countries.add(country15);
		countries.add(country16);
		countries.add(country17);
		countries.add(country18);
		countries.add(country19);
		countries.add(country20);
		countries.add(country21);
		countries.add(country22);
		countries.add(country23);
		countries.add(country24);
		countries.add(country25);
		countries.add(country26);
		countries.add(country27);
		countries.add(country28);
		countries.add(country29);
		countries.add(country30);
		countries.add(country31);
		countries.add(country32);
		countries.add(country33);
		countries.add(country34);
		countries.add(country35);
		countries.add(country36);
		countries.add(country37);
		countries.add(country38);
		countries.add(country39);
		countries.add(country40);
		countries.add(country41);
		countries.add(country42);
		countries.add(country43);
		countries.add(country44);
		countries.add(country45);
		countries.add(country46);
		countries.add(country47);
		countries.add(country48);
		countries.add(country49);
		countries.add(country50);
		countries.add(country51);
		countries.add(country52);
		countries.add(country53);
		countries.add(country54);
		countries.add(country55);
		countries.add(country56);
		countries.add(country57);
		countries.add(country58);
		countries.add(country59);
		countries.add(country60);
		countries.add(country61);
		countries.add(country62);
		countries.add(country63);
		countries.add(country64);
		countries.add(country65);
		countries.add(country66);
		countries.add(country67);
		countries.add(country68);
		countries.add(country69);
		countries.add(country70);
		countries.add(country71);
		countries.add(country72);
		countries.add(country73);
		countries.add(country74);
		countries.add(country75);
		countries.add(country76);
		countries.add(country77);
		countries.add(country78);
		countries.add(country79);
		countries.add(country80);
		countries.add(country81);
		countries.add(country82);
		countries.add(country83);
		countries.add(country84);
		countries.add(country85);
		countries.add(country86);
		countries.add(country87);
		countries.add(country88);
		countries.add(country89);
		countries.add(country90);
		countries.add(country91);
		countries.add(country92);
		countries.add(country93);
		countries.add(country94);
		countries.add(country95);
		countries.add(country96);
		countries.add(country97);
		countries.add(country98);
		countries.add(country99);
		countries.add(country100);
		countries.add(country101);
		countries.add(country102);
		countries.add(country103);
		countries.add(country104);
		countries.add(country105);
		countries.add(country106);
		countries.add(country107);
		countries.add(country108);
		countries.add(country109);
		countries.add(country110);
		countries.add(country111);
		countries.add(country112);
		countries.add(country113);
		countries.add(country114);
		countries.add(country115);
		countries.add(country116);
		countries.add(country117);
		countries.add(country118);
		countries.add(country119);
		countries.add(country120);
		countries.add(country121);
		countries.add(country122);
		countries.add(country123);
		countries.add(country124);
		countries.add(country125);
		countries.add(country126);
		countries.add(country127);
		countries.add(country128);
		countries.add(country129);
		countries.add(country130);
		countries.add(country131);
		countries.add(country132);
		countries.add(country133);
		countries.add(country134);
		countries.add(country135);
		countries.add(country136);
		countries.add(country137);
		countries.add(country138);
		countries.add(country139);
		countries.add(country140);
		countries.add(country141);
		countries.add(country142);
		countries.add(country143);
		countries.add(country144);
		countries.add(country145);
		countries.add(country146);
		countries.add(country147);
		countries.add(country148);
		countries.add(country149);
		countries.add(country150);
		countries.add(country151);
		countries.add(country152);
		countries.add(country153);
		countries.add(country154);
		countries.add(country155);
		countries.add(country156);
		countries.add(country157);
		countries.add(country158);
		countries.add(country159);
		countries.add(country160);
		countries.add(country161);
		countries.add(country162);
		countries.add(country163);
		countries.add(country164);
		countries.add(country165);
		countries.add(country166);
		countries.add(country167);
		countries.add(country168);
		countries.add(country169);
		countries.add(country170);
		countries.add(country171);
		countries.add(country172);
		countries.add(country173);
		countries.add(country174);
		countries.add(country175);
		countries.add(country176);
		countries.add(country177);
		countries.add(country178);
		countries.add(country179);
		countries.add(country180);
		countries.add(country181);
		countries.add(country182);
		countries.add(country183);
		countries.add(country184);
		countries.add(country185);
		countries.add(country186);
		countries.add(country187);
		countries.add(country188);
		countries.add(country189);
		countries.add(country190);
		countries.add(country191);
		countries.add(country192);
		countries.add(country193);
		countries.add(country194);
		countries.add(country195);
		
		

		Iterator<CountryDTO> itr = countries.iterator();
		while (itr.hasNext()) {
			CountryDTO country = itr.next();
			System.out.println(country);
		}
		
		System.out.println("\nTOTAL "+countries.size());

	}
}