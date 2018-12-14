import com.amazonaws.services.lambda.runtime.{Context, RequestHandler}
import com.amazonaws.services.lambda.runtime.events.{CloudWatchLogsEvent, SNSEvent}
import scala.collection.JavaConverters._

class LambdaResponder extends RequestHandler[SNSEvent,Unit] {
  override def handleRequest(input: SNSEvent, context: Context): Unit = {
    println()
  }
}
