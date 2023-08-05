CREATE TABLE picomanager.device (
    id int4 NOT NULL,
    ip varchar(255) NOT NULL,
    "name" varchar(255) NOT NULL,
    CONSTRAINT device_pkey PRIMARY KEY (id)
);