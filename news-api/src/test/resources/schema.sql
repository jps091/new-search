CREATE TABLE IF NOT EXISTS daily_stat (
                            id BIGINT GENERATED BY DEFAULT AS IDENTITY PRIMARY KEY, -- H2와 PostgreSQL에서 모두 작동
                            query VARCHAR(255),
                            event_date_time TIMESTAMP
);