-- Table: divinv.gear_mod

-- DROP TABLE divinv.gear_mod;

CREATE TABLE divinv.gear_mod
(
    id bigint NOT NULL,
    type character varying(200) COLLATE pg_catalog."default" NOT NULL,
    effect character varying(200) COLLATE pg_catalog."default" NOT NULL,
    level character varying(200)[] COLLATE pg_catalog."default" NOT NULL,
    CONSTRAINT gear_mod_pkey PRIMARY KEY (id)
)

    TABLESPACE pg_default;

ALTER TABLE divinv.gear_mod
    OWNER to postgres;