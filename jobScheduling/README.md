Job Scheduling
Libraries for scheduling background jobs.

JobRunr - Job scheduling library which utilizes lambdas for fire-and-forget, delayed and recurring jobs. Guarantees execution by single scheduler instance using optimistic locking. Has features for persistence, minimal dependencies and is embeddable.
Quartz - Feature-rich, open source job scheduling library that can be integrated within virtually any Java application.
Sundial - Lightweight framework to simply define jobs, define triggers and start the scheduler.
Wisp - Simple library with minimal footprint and straightforward API.
db-scheduler - Persistent and cluster-friendly scheduler.
easy-batch - Set up batch jobs with simple processing pipelines. Records are read in sequence from a data source, processed in pipeline and written in batches to a data sink.
shedlock - Makes sure that your scheduled tasks are executed at most once at the same time. If a task is being executed on one node, it acquires a lock which prevents execution of the same task from another node or thread.
