package org.mln.zerocode.integration.tests.kafka.produce;

import org.jsmart.zerocode.core.domain.JsonTestCase;
import org.jsmart.zerocode.core.domain.TargetEnv;
import org.jsmart.zerocode.core.runner.ZeroCodeUnitRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

@TargetEnv("kafka_servers/kafka_test_server_int_key.properties")
@RunWith(ZeroCodeUnitRunner.class)
public class KafkaProduceJsonTest {

    @Test
    @JsonTestCase("kafka/produce/test_kafka_produce_json_record.json")
    public void
    testProduce_json_record() throws Exception {
    }
    @Test
    @JsonTestCase("kafka/produce/file_produce/test_kafka_produce_json_file.json")
    public void
    testProduce_json_file() throws Exception {
    }

}
