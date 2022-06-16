use generationg1;
drop table IF EXISTS paises;
CREATE TABLE paises (
    `id` int(11)  NOT NULL auto_increment,
    `code` smallint(6) default NULL,
    `iso3166a1` char(2) default NULL,
    `iso3166a2` char(3) default NULL,
    `nombre` varchar(128) default NULL,
    PRIMARY KEY (`id`)
);

INSERT INTO
    paises
VALUES
    (1, 4, 'AF', 'AFG', 'Afganistán');

INSERT INTO
    paises
VALUES
    (2, 248, 'AX', 'ALA', 'Islas Gland');

INSERT INTO
    paises
VALUES
    (3, 8, 'AL', 'ALB', 'Albania');

INSERT INTO
    paises
VALUES
    (4, 276, 'DE', 'DEU', 'Alemania');

INSERT INTO
    paises
VALUES
    (5, 20, 'AD', 'AND', 'Andorra');

INSERT INTO
    paises
VALUES
    (6, 24, 'AO', 'AGO', 'Angola');

INSERT INTO
    paises
VALUES
    (7, 660, 'AI', 'AIA', 'Anguilla');

INSERT INTO
    paises
VALUES
    (8, 10, 'AQ', 'ATA', 'Antártida');

INSERT INTO
    paises
VALUES
    (9, 28, 'AG', 'ATG', 'Antigua y Barbuda');

INSERT INTO
    paises
VALUES
    (10, 530, 'AN', 'ANT', 'Antillas Holandesas');

INSERT INTO
    paises
VALUES
    (11, 682, 'SA', 'SAU', 'Arabia Saudí');

INSERT INTO
    paises
VALUES
    (12, 12, 'DZ', 'DZA', 'Argelia');

INSERT INTO
    paises
VALUES
    (13, 32, 'AR', 'ARG', 'Argentina');

INSERT INTO
    paises
VALUES
    (14, 51, 'AM', 'ARM', 'Armenia');

INSERT INTO
    paises
VALUES
    (15, 533, 'AW', 'ABW', 'Aruba');

INSERT INTO
    paises
VALUES
    (16, 36, 'AU', 'AUS', 'Australia');

INSERT INTO
    paises
VALUES
    (17, 40, 'AT', 'AUT', 'Austria');

INSERT INTO
    paises
VALUES
    (18, 31, 'AZ', 'AZE', 'Azerbaiyán');

INSERT INTO
    paises
VALUES
    (19, 44, 'BS', 'BHS', 'Bahamas');

INSERT INTO
    paises
VALUES
    (20, 48, 'BH', 'BHR', 'Bahréin');

INSERT INTO
    paises
VALUES
    (21, 50, 'BD', 'BGD', 'Bangladesh');

INSERT INTO
    paises
VALUES
    (22, 52, 'BB', 'BRB', 'Barbados');

INSERT INTO
    paises
VALUES
    (23, 112, 'BY', 'BLR', 'Bielorrusia');

INSERT INTO
    paises
VALUES
    (24, 56, 'BE', 'BEL', 'Bélgica');

INSERT INTO
    paises
VALUES
    (25, 84, 'BZ', 'BLZ', 'Belice');

INSERT INTO
    paises
VALUES
    (26, 204, 'BJ', 'BEN', 'Benin');

INSERT INTO
    paises
VALUES
    (27, 60, 'BM', 'BMU', 'Bermudas');

INSERT INTO
    paises
VALUES
    (28, 64, 'BT', 'BTN', 'Bhután');

INSERT INTO
    paises
VALUES
    (29, 68, 'BO', 'BOL', 'Bolivia');

INSERT INTO
    paises
VALUES
    (30, 70, 'BA', 'BIH', 'Bosnia y Herzegovina');

INSERT INTO
    paises
VALUES
    (31, 72, 'BW', 'BWA', 'Botsuana');

INSERT INTO
    paises
VALUES
    (32, 74, 'BV', 'BVT', 'Isla Bouvet');

INSERT INTO
    paises
VALUES
    (33, 76, 'BR', 'BRA', 'Brasil');

INSERT INTO
    paises
VALUES
    (34, 96, 'BN', 'BRN', 'Brunéi');

INSERT INTO
    paises
VALUES
    (35, 100, 'BG', 'BGR', 'Bulgaria');

INSERT INTO
    paises
VALUES
    (36, 854, 'BF', 'BFA', 'Burkina Faso');

INSERT INTO
    paises
VALUES
    (37, 108, 'BI', 'BDI', 'Burundi');

INSERT INTO
    paises
VALUES
    (38, 132, 'CV', 'CPV', 'Cabo Verde');

INSERT INTO
    paises
VALUES
    (39, 136, 'KY', 'CYM', 'Islas Caimán');

INSERT INTO
    paises
VALUES
    (40, 116, 'KH', 'KHM', 'Camboya');

INSERT INTO
    paises
VALUES
    (41, 120, 'CM', 'CMR', 'Camerún');

INSERT INTO
    paises
VALUES
    (42, 124, 'CA', 'CAN', 'Canadá');

INSERT INTO
    paises
VALUES
    (43, 140, 'CF', 'CAF', 'República Centroafricana');

INSERT INTO
    paises
VALUES
    (44, 148, 'TD', 'TCD', 'Chad');

INSERT INTO
    paises
VALUES
    (45, 203, 'CZ', 'CZE', 'República Checa');

INSERT INTO
    paises
VALUES
    (46, 152, 'CL', 'CHL', 'Chile');

INSERT INTO
    paises
VALUES
    (47, 156, 'CN', 'CHN', 'China');

INSERT INTO
    paises
VALUES
    (48, 196, 'CY', 'CYP', 'Chipre');

INSERT INTO
    paises
VALUES
    (49, 162, 'CX', 'CXR', 'Isla de Navidad');

INSERT INTO
    paises
VALUES
    (50, 336, 'VA', 'VAT', 'Ciudad del Vaticano');

INSERT INTO
    paises
VALUES
    (51, 166, 'CC', 'CCK', 'Islas Cocos');

INSERT INTO
    paises
VALUES
    (52, 170, 'CO', 'COL', 'Colombia');

INSERT INTO
    paises
VALUES
    (53, 174, 'KM', 'COM', 'Comoras');

INSERT INTO
    paises
VALUES
    (
        54,
        180,
        'CD',
        'COD',
        'República Democrática del Congo'
    );

INSERT INTO
    paises
VALUES
    (55, 178, 'CG', 'COG', 'Congo');

INSERT INTO
    paises
VALUES
    (56, 184, 'CK', 'COK', 'Islas Cook');

INSERT INTO
    paises
VALUES
    (57, 408, 'KP', 'PRK', 'Corea del Norte');

INSERT INTO
    paises
VALUES
    (58, 410, 'KR', 'KOR', 'Corea del Sur');

INSERT INTO
    paises
VALUES
    (59, 384, 'CI', 'CIV', 'Costa de Marfil');

INSERT INTO
    paises
VALUES
    (60, 188, 'CR', 'CRI', 'Costa Rica');

INSERT INTO
    paises
VALUES
    (61, 191, 'HR', 'HRV', 'Croacia');

INSERT INTO
    paises
VALUES
    (62, 192, 'CU', 'CUB', 'Cuba');

INSERT INTO
    paises
VALUES
    (63, 208, 'DK', 'DNK', 'Dinamarca');

INSERT INTO
    paises
VALUES
    (64, 212, 'DM', 'DMA', 'Dominica');

INSERT INTO
    paises
VALUES
    (65, 214, 'DO', 'DOM', 'República Dominicana');

INSERT INTO
    paises
VALUES
    (66, 218, 'EC', 'ECU', 'Ecuador');

INSERT INTO
    paises
VALUES
    (67, 818, 'EG', 'EGY', 'Egipto');

INSERT INTO
    paises
VALUES
    (68, 222, 'SV', 'SLV', 'El Salvador');

INSERT INTO
    paises
VALUES
    (69, 784, 'AE', 'ARE', 'Emiratos Árabes Unidos');

INSERT INTO
    paises
VALUES
    (70, 232, 'ER', 'ERI', 'Eritrea');

INSERT INTO
    paises
VALUES
    (71, 703, 'SK', 'SVK', 'Eslovaquia');

INSERT INTO
    paises
VALUES
    (72, 705, 'SI', 'SVN', 'Eslovenia');

INSERT INTO
    paises
VALUES
    (73, 724, 'ES', 'ESP', 'España');

INSERT INTO
    paises
VALUES
    (
        74,
        581,
        'UM',
        'UMI',
        'Islas ultramarinas de Estados Unidos'
    );

INSERT INTO
    paises
VALUES
    (75, 840, 'US', 'USA', 'Estados Unidos');

INSERT INTO
    paises
VALUES
    (76, 233, 'EE', 'EST', 'Estonia');

INSERT INTO
    paises
VALUES
    (77, 231, 'ET', 'ETH', 'Etiopía');

INSERT INTO
    paises
VALUES
    (78, 234, 'FO', 'FRO', 'Islas Feroe');

INSERT INTO
    paises
VALUES
    (79, 608, 'PH', 'PHL', 'Filipinas');

INSERT INTO
    paises
VALUES
    (80, 246, 'FI', 'FIN', 'Finlandia');

INSERT INTO
    paises
VALUES
    (81, 242, 'FJ', 'FJI', 'Fiyi');

INSERT INTO
    paises
VALUES
    (82, 250, 'FR', 'FRA', 'Francia');

INSERT INTO
    paises
VALUES
    (83, 266, 'GA', 'GAB', 'Gabón');

INSERT INTO
    paises
VALUES
    (84, 270, 'GM', 'GMB', 'Gambia');

INSERT INTO
    paises
VALUES
    (85, 268, 'GE', 'GEO', 'Georgia');

INSERT INTO
    paises
VALUES
    (
        86,
        239,
        'GS',
        'SGS',
        'Islas Georgias del Sur y Sandwich del Sur'
    );

INSERT INTO
    paises
VALUES
    (87, 288, 'GH', 'GHA', 'Ghana');

INSERT INTO
    paises
VALUES
    (88, 292, 'GI', 'GIB', 'Gibraltar');

INSERT INTO
    paises
VALUES
    (89, 308, 'GD', 'GRD', 'Granada');

INSERT INTO
    paises
VALUES
    (90, 300, 'GR', 'GRC', 'Grecia');

INSERT INTO
    paises
VALUES
    (91, 304, 'GL', 'GRL', 'Groenlandia');

INSERT INTO
    paises
VALUES
    (92, 312, 'GP', 'GLP', 'Guadalupe');

INSERT INTO
    paises
VALUES
    (93, 316, 'GU', 'GUM', 'Guam');

INSERT INTO
    paises
VALUES
    (94, 320, 'GT', 'GTM', 'Guatemala');

INSERT INTO
    paises
VALUES
    (95, 254, 'GF', 'GUF', 'Guayana Francesa');

INSERT INTO
    paises
VALUES
    (96, 324, 'GN', 'GIN', 'Guinea');

INSERT INTO
    paises
VALUES
    (97, 226, 'GQ', 'GNQ', 'Guinea Ecuatorial');

INSERT INTO
    paises
VALUES
    (98, 624, 'GW', 'GNB', 'Guinea-Bissau');

INSERT INTO
    paises
VALUES
    (99, 328, 'GY', 'GUY', 'Guyana');

INSERT INTO
    paises
VALUES
    (100, 332, 'HT', 'HTI', 'Haití');

INSERT INTO
    paises
VALUES
    (101, 334, 'HM', 'HMD', 'Islas Heard y McDonald');

INSERT INTO
    paises
VALUES
    (102, 340, 'HN', 'HND', 'Honduras');

INSERT INTO
    paises
VALUES
    (103, 344, 'HK', 'HKG', 'Hong Kong');

INSERT INTO
    paises
VALUES
    (104, 348, 'HU', 'HUN', 'Hungría');

INSERT INTO
    paises
VALUES
    (105, 356, 'IN', 'IND', 'India');

INSERT INTO
    paises
VALUES
    (106, 360, 'ID', 'IDN', 'Indonesia');

INSERT INTO
    paises
VALUES
    (107, 364, 'IR', 'IRN', 'Irán');

INSERT INTO
    paises
VALUES
    (108, 368, 'IQ', 'IRQ', 'Iraq');

INSERT INTO
    paises
VALUES
    (109, 372, 'IE', 'IRL', 'Irlanda');

INSERT INTO
    paises
VALUES
    (110, 352, 'IS', 'ISL', 'Islandia');

INSERT INTO
    paises
VALUES
    (111, 376, 'IL', 'ISR', 'Israel');

INSERT INTO
    paises
VALUES
    (112, 380, 'IT', 'ITA', 'Italia');

INSERT INTO
    paises
VALUES
    (113, 388, 'JM', 'JAM', 'Jamaica');

INSERT INTO
    paises
VALUES
    (114, 392, 'JP', 'JPN', 'Japón');

INSERT INTO
    paises
VALUES
    (115, 400, 'JO', 'JOR', 'Jordania');

INSERT INTO
    paises
VALUES
    (116, 398, 'KZ', 'KAZ', 'Kazajstán');

INSERT INTO
    paises
VALUES
    (117, 404, 'KE', 'KEN', 'Kenia');

INSERT INTO
    paises
VALUES
    (118, 417, 'KG', 'KGZ', 'Kirguistán');

INSERT INTO
    paises
VALUES
    (119, 296, 'KI', 'KIR', 'Kiribati');

INSERT INTO
    paises
VALUES
    (120, 414, 'KW', 'KWT', 'Kuwait');

INSERT INTO
    paises
VALUES
    (121, 418, 'LA', 'LAO', 'Laos');

INSERT INTO
    paises
VALUES
    (122, 426, 'LS', 'LSO', 'Lesotho');

INSERT INTO
    paises
VALUES
    (123, 428, 'LV', 'LVA', 'Letonia');

INSERT INTO
    paises
VALUES
    (124, 422, 'LB', 'LBN', 'Líbano');

INSERT INTO
    paises
VALUES
    (125, 430, 'LR', 'LBR', 'Liberia');

INSERT INTO
    paises
VALUES
    (126, 434, 'LY', 'LBY', 'Libia');

INSERT INTO
    paises
VALUES
    (127, 438, 'LI', 'LIE', 'Liechtenstein');

INSERT INTO
    paises
VALUES
    (128, 440, 'LT', 'LTU', 'Lituania');

INSERT INTO
    paises
VALUES
    (129, 442, 'LU', 'LUX', 'Luxemburgo');

INSERT INTO
    paises
VALUES
    (130, 446, 'MO', 'MAC', 'Macao');

INSERT INTO
    paises
VALUES
    (131, 807, 'MK', 'MKD', 'ARY Macedonia');

INSERT INTO
    paises
VALUES
    (132, 450, 'MG', 'MDG', 'Madagascar');

INSERT INTO
    paises
VALUES
    (133, 458, 'MY', 'MYS', 'Malasia');

INSERT INTO
    paises
VALUES
    (134, 454, 'MW', 'MWI', 'Malawi');

INSERT INTO
    paises
VALUES
    (135, 462, 'MV', 'MDV', 'Maldivas');

INSERT INTO
    paises
VALUES
    (136, 466, 'ML', 'MLI', 'Malí');

INSERT INTO
    paises
VALUES
    (137, 470, 'MT', 'MLT', 'Malta');

INSERT INTO
    paises
VALUES
    (138, 238, 'FK', 'FLK', 'Islas Malvinas');

INSERT INTO
    paises
VALUES
    (
        139,
        580,
        'MP',
        'MNP',
        'Islas Marianas del Norte'
    );

INSERT INTO
    paises
VALUES
    (140, 504, 'MA', 'MAR', 'Marruecos');

INSERT INTO
    paises
VALUES
    (141, 584, 'MH', 'MHL', 'Islas Marshall');

INSERT INTO
    paises
VALUES
    (142, 474, 'MQ', 'MTQ', 'Martinica');

INSERT INTO
    paises
VALUES
    (143, 480, 'MU', 'MUS', 'Mauricio');

INSERT INTO
    paises
VALUES
    (144, 478, 'MR', 'MRT', 'Mauritania');

INSERT INTO
    paises
VALUES
    (145, 175, 'YT', 'MYT', 'Mayotte');

INSERT INTO
    paises
VALUES
    (146, 484, 'MX', 'MEX', 'México');

INSERT INTO
    paises
VALUES
    (147, 583, 'FM', 'FSM', 'Micronesia');

INSERT INTO
    paises
VALUES
    (148, 498, 'MD', 'MDA', 'Moldavia');

INSERT INTO
    paises
VALUES
    (149, 492, 'MC', 'MCO', 'Mónaco');

INSERT INTO
    paises
VALUES
    (150, 496, 'MN', 'MNG', 'Mongolia');

INSERT INTO
    paises
VALUES
    (151, 500, 'MS', 'MSR', 'Montserrat');

INSERT INTO
    paises
VALUES
    (152, 508, 'MZ', 'MOZ', 'Mozambique');

INSERT INTO
    paises
VALUES
    (153, 104, 'MM', 'MMR', 'Myanmar');

INSERT INTO
    paises
VALUES
    (154, 516, 'NA', 'NAM', 'Namibia');

INSERT INTO
    paises
VALUES
    (155, 520, 'NR', 'NRU', 'Nauru');

INSERT INTO
    paises
VALUES
    (156, 524, 'NP', 'NPL', 'Nepal');

INSERT INTO
    paises
VALUES
    (157, 558, 'NI', 'NIC', 'Nicaragua');

INSERT INTO
    paises
VALUES
    (158, 562, 'NE', 'NER', 'Níger');

INSERT INTO
    paises
VALUES
    (159, 566, 'NG', 'NGA', 'Nigeria');

INSERT INTO
    paises
VALUES
    (160, 570, 'NU', 'NIU', 'Niue');

INSERT INTO
    paises
VALUES
    (161, 574, 'NF', 'NFK', 'Isla Norfolk');

INSERT INTO
    paises
VALUES
    (162, 578, 'NO', 'NOR', 'Noruega');

INSERT INTO
    paises
VALUES
    (163, 540, 'NC', 'NCL', 'Nueva Caledonia');

INSERT INTO
    paises
VALUES
    (164, 554, 'NZ', 'NZL', 'Nueva Zelanda');

INSERT INTO
    paises
VALUES
    (165, 512, 'OM', 'OMN', 'Omán');

INSERT INTO
    paises
VALUES
    (166, 528, 'NL', 'NLD', 'Países Bajos');

INSERT INTO
    paises
VALUES
    (167, 586, 'PK', 'PAK', 'Pakistán');

INSERT INTO
    paises
VALUES
    (168, 585, 'PW', 'PLW', 'Palau');

INSERT INTO
    paises
VALUES
    (169, 275, 'PS', 'PSE', 'Palestina');

INSERT INTO
    paises
VALUES
    (170, 591, 'PA', 'PAN', 'Panamá');

INSERT INTO
    paises
VALUES
    (171, 598, 'PG', 'PNG', 'Papúa Nueva Guinea');

INSERT INTO
    paises
VALUES
    (172, 600, 'PY', 'PRY', 'Paraguay');

INSERT INTO
    paises
VALUES
    (173, 604, 'PE', 'PER', 'Perú');

INSERT INTO
    paises
VALUES
    (174, 612, 'PN', 'PCN', 'Islas Pitcairn');

INSERT INTO
    paises
VALUES
    (175, 258, 'PF', 'PYF', 'Polinesia Francesa');

INSERT INTO
    paises
VALUES
    (176, 616, 'PL', 'POL', 'Polonia');

INSERT INTO
    paises
VALUES
    (177, 620, 'PT', 'PRT', 'Portugal');

INSERT INTO
    paises
VALUES
    (178, 630, 'PR', 'PRI', 'Puerto Rico');

INSERT INTO
    paises
VALUES
    (179, 634, 'QA', 'QAT', 'Qatar');

INSERT INTO
    paises
VALUES
    (180, 826, 'GB', 'GBR', 'Reino Unido');

INSERT INTO
    paises
VALUES
    (181, 638, 'RE', 'REU', 'Reunión');

INSERT INTO
    paises
VALUES
    (182, 646, 'RW', 'RWA', 'Ruanda');

INSERT INTO
    paises
VALUES
    (183, 642, 'RO', 'ROU', 'Rumania');

INSERT INTO
    paises
VALUES
    (184, 643, 'RU', 'RUS', 'Rusia');

INSERT INTO
    paises
VALUES
    (185, 732, 'EH', 'ESH', 'Sahara Occidental');

INSERT INTO
    paises
VALUES
    (186, 90, 'SB', 'SLB', 'Islas Salomón');

INSERT INTO
    paises
VALUES
    (187, 882, 'WS', 'WSM', 'Samoa');

INSERT INTO
    paises
VALUES
    (188, 16, 'AS', 'ASM', 'Samoa Americana');

INSERT INTO
    paises
VALUES
    (189, 659, 'KN', 'KNA', 'San Cristóbal y Nevis');

INSERT INTO
    paises
VALUES
    (190, 674, 'SM', 'SMR', 'San Marino');

INSERT INTO
    paises
VALUES
    (191, 666, 'PM', 'SPM', 'San Pedro y Miquelón');

INSERT INTO
    paises
VALUES
    (
        192,
        670,
        'VC',
        'VCT',
        'San Vicente y las Granadinas'
    );

INSERT INTO
    paises
VALUES
    (193, 654, 'SH', 'SHN', 'Santa Helena');

INSERT INTO
    paises
VALUES
    (194, 662, 'LC', 'LCA', 'Santa Lucía');

INSERT INTO
    paises
VALUES
    (195, 678, 'ST', 'STP', 'Santo Tomé y Príncipe');

INSERT INTO
    paises
VALUES
    (196, 686, 'SN', 'SEN', 'Senegal');

INSERT INTO
    paises
VALUES
    (197, 891, 'CS', 'SCG', 'Serbia y Montenegro');

INSERT INTO
    paises
VALUES
    (198, 690, 'SC', 'SYC', 'Seychelles');

INSERT INTO
    paises
VALUES
    (199, 694, 'SL', 'SLE', 'Sierra Leona');

INSERT INTO
    paises
VALUES
    (200, 702, 'SG', 'SGP', 'Singapur');

INSERT INTO
    paises
VALUES
    (201, 760, 'SY', 'SYR', 'Siria');

INSERT INTO
    paises
VALUES
    (202, 706, 'SO', 'SOM', 'Somalia');

INSERT INTO
    paises
VALUES
    (203, 144, 'LK', 'LKA', 'Sri Lanka');

INSERT INTO
    paises
VALUES
    (204, 748, 'SZ', 'SWZ', 'Suazilandia');

INSERT INTO
    paises
VALUES
    (205, 710, 'ZA', 'ZAF', 'Sudáfrica');

INSERT INTO
    paises
VALUES
    (206, 736, 'SD', 'SDN', 'Sudán');

INSERT INTO
    paises
VALUES
    (207, 752, 'SE', 'SWE', 'Suecia');

INSERT INTO
    paises
VALUES
    (208, 756, 'CH', 'CHE', 'Suiza');

INSERT INTO
    paises
VALUES
    (209, 740, 'SR', 'SUR', 'Surinam');

INSERT INTO
    paises
VALUES
    (210, 744, 'SJ', 'SJM', 'Svalbard y Jan Mayen');

INSERT INTO
    paises
VALUES
    (211, 764, 'TH', 'THA', 'Tailandia');

INSERT INTO
    paises
VALUES
    (212, 158, 'TW', 'TWN', 'Taiwán');

INSERT INTO
    paises
VALUES
    (213, 834, 'TZ', 'TZA', 'Tanzania');

INSERT INTO
    paises
VALUES
    (214, 762, 'TJ', 'TJK', 'Tayikistán');

INSERT INTO
    paises
VALUES
    (
        215,
        86,
        'IO',
        'IOT',
        'Territorio Británico del Océano Índico'
    );

INSERT INTO
    paises
VALUES
    (
        216,
        260,
        'TF',
        'ATF',
        'Territorios Australes Franceses'
    );

INSERT INTO
    paises
VALUES
    (217, 626, 'TL', 'TLS', 'Timor Oriental');

INSERT INTO
    paises
VALUES
    (218, 768, 'TG', 'TGO', 'Togo');

INSERT INTO
    paises
VALUES
    (219, 772, 'TK', 'TKL', 'Tokelau');

INSERT INTO
    paises
VALUES
    (220, 776, 'TO', 'TON', 'Tonga');

INSERT INTO
    paises
VALUES
    (221, 780, 'TT', 'TTO', 'Trinidad y Tobago');

INSERT INTO
    paises
VALUES
    (222, 788, 'TN', 'TUN', 'Túnez');

INSERT INTO
    paises
VALUES
    (223, 796, 'TC', 'TCA', 'Islas Turcas y Caicos');

INSERT INTO
    paises
VALUES
    (224, 795, 'TM', 'TKM', 'Turkmenistán');

INSERT INTO
    paises
VALUES
    (225, 792, 'TR', 'TUR', 'Turquía');

INSERT INTO
    paises
VALUES
    (226, 798, 'TV', 'TUV', 'Tuvalu');

INSERT INTO
    paises
VALUES
    (227, 804, 'UA', 'UKR', 'Ucrania');

INSERT INTO
    paises
VALUES
    (228, 800, 'UG', 'UGA', 'Uganda');

INSERT INTO
    paises
VALUES
    (229, 858, 'UY', 'URY', 'Uruguay');

INSERT INTO
    paises
VALUES
    (230, 860, 'UZ', 'UZB', 'Uzbekistán');

INSERT INTO
    paises
VALUES
    (231, 548, 'VU', 'VUT', 'Vanuatu');

INSERT INTO
    paises
VALUES
    (232, 862, 'VE', 'VEN', 'Venezuela');

INSERT INTO
    paises
VALUES
    (233, 704, 'VN', 'VNM', 'Vietnam');

INSERT INTO
    paises
VALUES
    (
        234,
        92,
        'VG',
        'VGB',
        'Islas Vírgenes Británicas'
    );

INSERT INTO
    paises
VALUES
    (
        235,
        850,
        'VI',
        'VIR',
        'Islas Vírgenes de los Estados Unidos'
    );

INSERT INTO
    paises
VALUES
    (236, 876, 'WF', 'WLF', 'Wallis y Futuna');

INSERT INTO
    paises
VALUES
    (237, 887, 'YE', 'YEM', 'Yemen');

INSERT INTO
    paises
VALUES
    (238, 262, 'DJ', 'DJI', 'Yibuti');

INSERT INTO
    paises
VALUES
    (239, 894, 'ZM', 'ZMB', 'Zambia');

INSERT INTO
    paises
VALUES
    (240, 716, 'ZW', 'ZWE', 'Zimbabue');

CREATE TABLE `region_cl` (
    `id_re` int(11) NOT NULL COMMENT 'ID unico',
    `str_descripcion` varchar(60) COLLATE latin1_spanish_ci NOT NULL COMMENT 'Nombre extenso',
    `str_romano` varchar(5) COLLATE latin1_spanish_ci NOT NULL COMMENT 'Número de región',
    `num_provincias` int(11) NOT NULL COMMENT 'total provincias',
    `num_comunas` int(11) NOT NULL COMMENT 'Total de comunas',
    PRIMARY KEY (`id_re`)
);

INSERT INTO
    `region_cl`
VALUES
    (1, 'ARICA Y PARINACOTA', 'XV', 2, 4),
    (2, 'TARAPACÁ', 'I', 2, 7),
    (3, 'ANTOFAGASTA', 'II', 3, 9),
    (4, 'ATACAMA ', 'III', 3, 9),
    (5, 'COQUIMBO ', 'IV', 3, 15),
    (6, 'VALPARAÍSO ', 'V', 8, 38),
    (
        7,
        'DEL LIBERTADOR GRAL. BERNARDO O\'HIGGINS ',
        'VI',
        3,
        33
    ),
    (8, 'DEL MAULE', 'VII', 4, 30),
    (9, 'DEL BIOBÍO ', 'VIII', 4, 54),
    (10, 'DE LA ARAUCANÍA', 'IX', 2, 32),
    (11, 'DE LOS RÍOS', 'XIV', 2, 12),
    (12, 'DE LOS LAGOS', 'X', 4, 30),
    (
        13,
        'AISÉN DEL GRAL. CARLOS IBAÑEZ DEL CAMPO ',
        'XI',
        4,
        10
    ),
    (
        14,
        'MAGALLANES Y DE LA ANTÁRTICA CHILENA',
        'XII',
        4,
        11
    ),
    (15, 'METROPOLITANA DE SANTIAGO', 'RM', 6, 52);

DROP TABLE IF EXISTS 'comuna_cl';

CREATE TABLE `comuna_cl` (
    `id_co` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID unico de la comuna',
    `id_pr` int(11) NOT NULL COMMENT 'ID de la provincia asociada',
    `str_descripcion` varchar(30) COLLATE latin1_spanish_ci DEFAULT NULL COMMENT 'Nombre descriptivo de la comuna',
    PRIMARY KEY (`id_co`, `id_pr`)
) ENGINE = InnoDB AUTO_INCREMENT = 347 DEFAULT CHARSET = latin1 COLLATE = latin1_spanish_ci COMMENT = 'Lista de comunas por provincias';

/*!40101 SET character_set_client = @saved_cs_client */
;

INSERT INTO
    `comuna_cl`
VALUES
    (1, 1, 'ARICA'),
    (2, 1, 'CAMARONES'),
    (3, 2, 'PUTRE'),
    (4, 2, 'GENERAL LAGOS'),
    (5, 3, 'IQUIQUE'),
    (6, 3, 'ALTO HOSPICIO'),
    (7, 4, 'POZO ALMONTE'),
    (8, 4, 'CAMIÑA'),
    (9, 4, 'COLCHANE'),
    (10, 4, 'HUARA'),
    (11, 4, 'PICA'),
    (12, 5, 'ANTOFAGASTA'),
    (13, 5, 'MEJILLONES'),
    (14, 5, 'SIERRA GORDA'),
    (15, 5, 'TALTAL'),
    (16, 6, 'CALAMA'),
    (17, 6, 'OLLAGÜE'),
    (18, 6, 'SAN PEDRO DE ATACAMA'),
    (19, 7, 'TOCOPILLA'),
    (20, 7, 'MARÍA ELENA'),
    (21, 8, 'COPIAPÓ'),
    (22, 8, 'CALDERA'),
    (23, 8, 'TIERRA AMARILLA'),
    (24, 9, 'CHAÑARAL'),
    (25, 9, 'DIEGO DE ALMAGRO'),
    (26, 10, 'VALLENAR'),
    (27, 10, 'ALTO DEL CARMEN'),
    (28, 10, 'FREIRINA'),
    (29, 10, 'HUASCO'),
    (30, 11, 'LA SERENA'),
    (31, 11, 'COQUIMBO'),
    (32, 11, 'ANDACOLLO'),
    (33, 11, 'LA HIGUERA'),
    (34, 11, 'PAIGUANO'),
    (35, 11, 'VICUÑA'),
    (36, 12, 'ILLAPEL'),
    (37, 12, 'CANELA'),
    (38, 12, 'LOS VILOS'),
    (39, 12, 'SALAMANCA'),
    (40, 13, 'OVALLE'),
    (41, 13, 'COMBARBALÁ'),
    (42, 13, 'MONTE PATRIA'),
    (43, 13, 'PUNITAQUI'),
    (44, 13, 'RÍO HURTADO'),
    (45, 14, 'VALPARAÍSO'),
    (46, 14, 'CASABLANCA'),
    (47, 14, 'CONCÓN'),
    (48, 14, 'JUAN FERNÁNDEZ'),
    (49, 14, 'PUCHUNCAVÍ'),
    (50, 14, 'QUINTERO'),
    (51, 14, 'VIÑA DEL MAR'),
    (52, 15, 'ISLA DE PASCUA'),
    (53, 16, 'LOS ANDES'),
    (54, 16, 'CALLE LARGA'),
    (55, 16, 'RINCONADA'),
    (56, 16, 'SAN ESTEBAN'),
    (57, 17, 'LA LIGUA'),
    (58, 17, 'CABILDO'),
    (59, 17, 'PAPUDO'),
    (60, 17, 'PETORCA'),
    (61, 17, 'ZAPALLAR'),
    (62, 18, 'QUILLOTA'),
    (63, 18, 'CALERA'),
    (64, 18, 'HIJUELAS'),
    (65, 18, 'LA CRUZ'),
    (66, 18, 'NOGALES'),
    (67, 19, 'SAN ANTONIO'),
    (68, 19, 'ALGARROBO'),
    (69, 19, 'CARTAGENA'),
    (70, 19, 'EL QUISCO'),
    (71, 19, 'EL TABO'),
    (72, 19, 'SANTO DOMINGO'),
    (73, 20, 'SAN FELIPE'),
    (74, 20, 'CATEMU'),
    (75, 20, 'LLAILLAY'),
    (76, 20, 'PANQUEHUE'),
    (77, 20, 'PUTAENDO'),
    (78, 20, 'SANTA MARÍA'),
    (79, 21, 'LIMACHE'),
    (80, 21, 'QUILPUÉ'),
    (81, 21, 'VILLA ALEMANA'),
    (82, 21, 'OLMUÉ'),
    (83, 22, 'RANCAGUA'),
    (84, 22, 'CODEGUA'),
    (85, 22, 'COINCO'),
    (86, 22, 'COLTAUCO'),
    (87, 22, 'DOÑIHUE'),
    (88, 22, 'GRANEROS'),
    (89, 22, 'LAS CABRAS'),
    (90, 22, 'MACHALÍ'),
    (91, 22, 'MALLOA'),
    (92, 22, 'MOSTAZAL'),
    (93, 22, 'OLIVAR'),
    (94, 22, 'PEUMO'),
    (95, 22, 'PICHIDEGUA'),
    (96, 22, 'QUINTA DE TILCOCO'),
    (97, 22, 'RENGO'),
    (98, 22, 'REQUÍNOA'),
    (99, 22, 'SAN VICENTE'),
    (100, 23, 'PICHILEMU'),
    (101, 23, 'LA ESTRELLA'),
    (102, 23, 'LITUECHE'),
    (103, 23, 'MARCHIHUE'),
    (104, 23, 'NAVIDAD'),
    (105, 23, 'PAREDONES'),
    (106, 24, 'SAN FERNANDO'),
    (107, 24, 'CHÉPICA'),
    (108, 24, 'CHIMBARONGO'),
    (109, 24, 'LOLOL'),
    (110, 24, 'NANCAGUA'),
    (111, 24, 'PALMILLA'),
    (112, 24, 'PERALILLO'),
    (113, 24, 'PLACILLA'),
    (114, 24, 'PUMANQUE'),
    (115, 24, 'SANTA CRUZ'),
    (116, 25, 'TALCA'),
    (117, 25, 'CONSTITUCIÓN'),
    (118, 25, 'CUREPTO'),
    (119, 25, 'EMPEDRADO'),
    (120, 25, 'MAULE'),
    (121, 25, 'PELARCO'),
    (122, 25, 'PENCAHUE'),
    (123, 25, 'RÍO CLARO'),
    (124, 25, 'SAN CLEMENTE'),
    (125, 25, 'SAN RAFAEL'),
    (126, 26, 'CAUQUENES'),
    (127, 26, 'CHANCO'),
    (128, 26, 'PELLUHUE'),
    (129, 27, 'CURICÓ'),
    (130, 27, 'HUALAÑÉ'),
    (131, 27, 'LICANTÉN'),
    (132, 27, 'MOLINA'),
    (133, 27, 'RAUCO'),
    (134, 27, 'ROMERAL'),
    (135, 27, 'SAGRADA FAMILIA'),
    (136, 27, 'TENO'),
    (137, 27, 'VICHUQUÉN'),
    (138, 28, 'LINARES'),
    (139, 28, 'COLBÚN'),
    (140, 28, 'LONGAVÍ'),
    (141, 28, 'PARRAL'),
    (142, 28, 'RETIRO'),
    (143, 28, 'SAN JAVIER'),
    (144, 28, 'VILLA ALEGRE'),
    (145, 28, 'YERBAS BUENAS'),
    (146, 29, 'CONCEPCIÓN'),
    (147, 29, 'CORONEL'),
    (148, 29, 'CHIGUAYANTE'),
    (149, 29, 'FLORIDA'),
    (150, 29, 'HUALQUI'),
    (151, 29, 'LOTA'),
    (152, 29, 'PENCO'),
    (153, 29, 'SAN PEDRO DE LA PAZ'),
    (154, 29, 'SANTA JUANA'),
    (155, 29, 'TALCAHUANO'),
    (156, 29, 'TOMÉ'),
    (157, 29, 'HUALPÉN'),
    (158, 30, 'LEBU'),
    (159, 30, 'ARAUCO'),
    (160, 30, 'CAÑETE'),
    (161, 30, 'CONTULMO'),
    (162, 30, 'CURANILAHUE'),
    (163, 30, 'LOS ALAMOS'),
    (164, 30, 'TIRÚA'),
    (165, 31, 'LOS ANGELES'),
    (166, 31, 'ANTUCO'),
    (167, 31, 'CABRERO'),
    (168, 31, 'LAJA'),
    (169, 31, 'MULCHÉN'),
    (170, 31, 'NACIMIENTO'),
    (171, 31, 'NEGRETE'),
    (172, 31, 'QUILACO'),
    (173, 31, 'QUILLECO'),
    (174, 31, 'SAN ROSENDO'),
    (175, 31, 'SANTA BÁRBARA'),
    (176, 31, 'TUCAPEL'),
    (177, 31, 'YUMBEL'),
    (178, 31, 'ALTO BIOBÍO'),
    (179, 32, 'CHILLÁN'),
    (180, 32, 'BULNES'),
    (181, 32, 'COBQUECURA'),
    (182, 32, 'COELEMU'),
    (183, 32, 'COIHUECO'),
    (184, 32, 'CHILLÁN VIEJO'),
    (185, 32, 'EL CARMEN'),
    (186, 32, 'NINHUE'),
    (187, 32, 'ÑIQUÉN'),
    (188, 32, 'PEMUCO'),
    (189, 32, 'PINTO'),
    (190, 32, 'PORTEZUELO'),
    (191, 32, 'QUILLÓN'),
    (192, 32, 'QUIRIHUE'),
    (193, 32, 'RÁNQUIL'),
    (194, 32, 'SAN CARLOS'),
    (195, 32, 'SAN FABIÁN'),
    (196, 32, 'SAN IGNACIO'),
    (197, 32, 'SAN NICOLÁS'),
    (198, 32, 'TREGUACO'),
    (199, 32, 'YUNGAY'),
    (200, 33, 'TEMUCO'),
    (201, 33, 'CARAHUE'),
    (202, 33, 'CUNCO'),
    (203, 33, 'CURARREHUE'),
    (204, 33, 'FREIRE'),
    (205, 33, 'GALVARINO'),
    (206, 33, 'GORBEA'),
    (207, 33, 'LAUTARO'),
    (208, 33, 'LONCOCHE'),
    (209, 33, 'MELIPEUCO'),
    (210, 33, 'NUEVA IMPERIAL'),
    (211, 33, 'PADRE LAS CASAS'),
    (212, 33, 'PERQUENCO'),
    (213, 33, 'PITRUFQUÉN'),
    (214, 33, 'PUCÓN'),
    (215, 33, 'SAAVEDRA'),
    (216, 33, 'TEODORO SCHMIDT'),
    (217, 33, 'TOLTÉN'),
    (218, 33, 'VILCÚN'),
    (219, 33, 'VILLARRICA'),
    (220, 33, 'CHOLCHOL'),
    (221, 34, 'ANGOL'),
    (222, 34, 'COLLIPULLI'),
    (223, 34, 'CURACAUTÍN'),
    (224, 34, 'ERCILLA'),
    (225, 34, 'LONQUIMAY'),
    (226, 34, 'LOS SAUCES'),
    (227, 34, 'LUMACO'),
    (228, 34, 'PURÉN'),
    (229, 34, 'RENAICO'),
    (230, 34, 'TRAIGUÉN'),
    (231, 34, 'VICTORIA'),
    (232, 35, 'VALDIVIA'),
    (233, 35, 'CORRAL'),
    (234, 35, 'LANCO'),
    (235, 35, 'LOS LAGOS'),
    (236, 35, 'MÁFIL'),
    (237, 35, 'MARIQUINA'),
    (238, 35, 'PAILLACO'),
    (239, 35, 'PANGUIPULLI'),
    (240, 36, 'LA UNIÓN'),
    (241, 36, 'FUTRONO'),
    (242, 36, 'LAGO RANCO'),
    (243, 36, 'RÍO BUENO'),
    (244, 37, 'PUERTO MONTT'),
    (245, 37, 'CALBUCO'),
    (246, 37, 'COCHAMÓ'),
    (247, 37, 'FRESIA'),
    (248, 37, 'FRUTILLAR'),
    (249, 37, 'LOS MUERMOS'),
    (250, 37, 'LLANQUIHUE'),
    (251, 37, 'MAULLÍN'),
    (252, 37, 'PUERTO VARAS'),
    (253, 38, 'CASTRO'),
    (254, 38, 'ANCUD'),
    (255, 38, 'CHONCHI'),
    (256, 38, 'CURACO DE VÉLEZ'),
    (257, 38, 'DALCAHUE'),
    (258, 38, 'PUQUELDÓN'),
    (259, 38, 'QUEILÉN'),
    (260, 38, 'QUELLÓN'),
    (261, 38, 'QUEMCHI'),
    (262, 38, 'QUINCHAO'),
    (263, 39, 'OSORNO'),
    (264, 39, 'PUERTO OCTAY'),
    (265, 39, 'PURRANQUE'),
    (266, 39, 'PUYEHUE'),
    (267, 39, 'RÍO NEGRO'),
    (268, 39, 'SAN JUAN DE LA COSTA'),
    (269, 39, 'SAN PABLO'),
    (270, 40, 'CHAITÉN'),
    (271, 40, 'FUTALEUFÚ'),
    (272, 40, 'HUALAIHUÉ'),
    (273, 40, 'PALENA'),
    (274, 41, 'COIHAIQUE'),
    (275, 41, 'LAGO VERDE'),
    (276, 42, 'AISÉN'),
    (277, 42, 'CISNES'),
    (278, 42, 'GUAITECAS'),
    (279, 43, 'COCHRANE'),
    (280, 43, 'O\'HIGGINS'),
    (281, 43, 'TORTEL'),
    (282, 44, 'CHILE CHICO'),
    (283, 44, 'RÍO IBÁÑEZ'),
    (284, 45, 'PUNTA ARENAS'),
    (285, 45, 'LAGUNA BLANCA'),
    (286, 45, 'RÍO VERDE'),
    (287, 45, 'SAN GREGORIO'),
    (288, 46, 'CABO DE HORNOS'),
    (289, 46, 'ANTÁRTICA'),
    (290, 47, 'PORVENIR'),
    (291, 47, 'PRIMAVERA'),
    (292, 47, 'TIMAUKEL'),
    (293, 48, 'NATALES'),
    (294, 48, 'TORRES DEL PAINE'),
    (295, 49, 'SANTIAGO'),
    (296, 49, 'CERRILLOS'),
    (297, 49, 'CERRO NAVIA'),
    (298, 49, 'CONCHALÍ'),
    (299, 49, 'EL BOSQUE'),
    (300, 49, 'ESTACIÓN CENTRAL'),
    (301, 49, 'HUECHURABA'),
    (302, 49, 'INDEPENDENCIA'),
    (303, 49, 'LA CISTERNA'),
    (304, 49, 'LA FLORIDA'),
    (305, 49, 'LA GRANJA'),
    (306, 49, 'LA PINTANA'),
    (307, 49, 'LA REINA'),
    (308, 49, 'LAS CONDES'),
    (309, 49, 'LO BARNECHEA'),
    (310, 49, 'LO ESPEJO'),
    (311, 49, 'LO PRADO'),
    (312, 49, 'MACUL'),
    (313, 49, 'MAIPÚ'),
    (314, 49, 'ÑUÑOA'),
    (315, 49, 'PEDRO AGUIRRE CERDA'),
    (316, 49, 'PEÑALOLÉN'),
    (317, 49, 'PROVIDENCIA'),
    (318, 49, 'PUDAHUEL'),
    (319, 49, 'QUILICURA'),
    (320, 49, 'QUINTA NORMAL'),
    (321, 49, 'RECOLETA'),
    (322, 49, 'RENCA'),
    (323, 49, 'SAN JOAQUÍN'),
    (324, 49, 'SAN MIGUEL'),
    (325, 49, 'SAN RAMÓN'),
    (326, 49, 'VITACURA'),
    (327, 50, 'PUENTE ALTO'),
    (328, 50, 'PIRQUE'),
    (329, 50, 'SAN JOSÉ DE MAIPO'),
    (330, 51, 'COLINA'),
    (331, 51, 'LAMPA'),
    (332, 51, 'TILTIL'),
    (333, 52, 'SAN BERNARDO'),
    (334, 52, 'BUIN'),
    (335, 52, 'CALERA DE TANGO'),
    (336, 52, 'PAINE'),
    (337, 53, 'MELIPILLA'),
    (338, 53, 'ALHUÉ'),
    (339, 53, 'CURACAVÍ'),
    (340, 53, 'MARÍA PINTO'),
    (341, 53, 'SAN PEDRO'),
    (342, 54, 'TALAGANTE'),
    (343, 54, 'EL MONTE'),
    (344, 54, 'ISLA DE MAIPO'),
    (345, 54, 'PADRE HURTADO'),
    (346, 54, 'PEÑAFLOR');

--Alter table para agregar columna
--ALTER TABLE comuna_cl
--ADD region_id int;
--ALTER TABLE region_cl
--ADD pais_id int;

ALTER TABLE direcciones
ADD pais_id int;
ALTER TABLE direcciones
ADD ciudad_id int;
ALTER TABLE direcciones
ADD region_id int;

-- FOREING KEY
ALTER TABLE direcciones
ADD FOREIGN KEY (pais_id) REFERENCES paises(id);

ALTER TABLE direcciones
ADD FOREIGN KEY (region_id) REFERENCES region_cl(id_re);

ALTER TABLE direcciones
ADD FOREIGN KEY (ciudad_id) REFERENCES comuna_cl(id_co);
