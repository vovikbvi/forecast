CREATE TABLE "user_profile" (
	"id" serial NOT NULL,
	"email" character varying(50) NOT NULL UNIQUE,
	"password" character varying(50) NOT NULL,
	"user_role" int NOT NULL,
	"first_name" character varying NOT NULL,
	"last_name" character varying NOT NULL,
	"phone" character varying NOT NULL UNIQUE,
	"date_registr" TIMESTAMP NOT NULL,
	"card_info_id" int NOT NULL,
	"acept_registr" BOOLEAN NOT NULL,
	CONSTRAINT user_profile_pk PRIMARY KEY ("id")
) WITH (
  OIDS=FALSE
);



CREATE TABLE "card_info" (
	"id" serial NOT NULL,
	"card_type" int NOT NULL,
	"card_number" int NOT NULL,
	"card_ovner_firstname" character varying(50) NOT NULL,
	"card_ovner_lastname" character varying(50) NOT NULL,
	"expires_year" int NOT NULL,
	"expires_month" int NOT NULL,
	"security_code" int NOT NULL,
	CONSTRAINT card_info_pk PRIMARY KEY ("id")
) WITH (
  OIDS=FALSE
);



CREATE TABLE "main_table" (
	"id" serial NOT NULL,
	"pair_name" character varying NOT NULL,
	"pict_patch" character varying NOT NULL,
	"date" TIMESTAMP NOT NULL,
	CONSTRAINT main_table_pk PRIMARY KEY ("id")
) WITH (
  OIDS=FALSE
);



CREATE TABLE "payment" (
	"id" serial NOT NULL,
	"user_profile_id" int NOT NULL,
	"payment method" int NOT NULL,
	"amount" int NOT NULL,
	"date_bought" TIMESTAMP NOT NULL,
	"date_end_bought" TIMESTAMP NOT NULL,
	CONSTRAINT payment_pk PRIMARY KEY ("id")
) WITH (
  OIDS=FALSE
);



ALTER TABLE "user_profile" ADD CONSTRAINT "user_profile_fk0" FOREIGN KEY ("card_info_id") REFERENCES "card_info"("id");



ALTER TABLE "payment" ADD CONSTRAINT "payment_fk0" FOREIGN KEY ("user_profile_id") REFERENCES "user_profile"("id");

