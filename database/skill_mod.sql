-- Table: divinv.SKILL_MOD

-- DROP TABLE divinv."SKILL_MOD";

CREATE TABLE divinv."SKILL_MOD"
(
    id bigint NOT NULL,
    type character varying(200) COLLATE pg_catalog."default",
    slot character varying(200) COLLATE pg_catalog."default",
    attribute character varying(200) COLLATE pg_catalog."default",
    attribute_zusatz character varying(200) COLLATE pg_catalog."default",
    level character varying(30) COLLATE pg_catalog."default",
    CONSTRAINT "SKILL_MOD_pkey" PRIMARY KEY (id)
)

    TABLESPACE pg_default;

ALTER TABLE divinv."SKILL_MOD"
    OWNER to postgres;

COMMENT ON TABLE divinv."SKILL_MOD"
    IS 'Skill Mods';