package jjwu.xdeveloper.zookeeper;

import java.io.IOException;
import java.util.concurrent.CountDownLatch;

import org.apache.zookeeper.WatchedEvent;
import org.apache.zookeeper.Watcher;
import org.apache.zookeeper.Watcher.Event.KeeperState;
import org.apache.zookeeper.ZooKeeper;

public class AbstractZooKeeper implements Watcher {

	private static final int SESSION_TIME = 2000;
	protected ZooKeeper zooKeeper;
	protected CountDownLatch countDownLatch = new CountDownLatch(1);

	public void connect(String hosts) throws IOException, InterruptedException {
		zooKeeper = new ZooKeeper(hosts, AbstractZooKeeper.SESSION_TIME, this);
		countDownLatch.await();
	}

	public void close() throws InterruptedException {
		zooKeeper.close();
	}

	@Override
	public void process(WatchedEvent event) {
		if (event.getState() == KeeperState.SyncConnected) {
			countDownLatch.countDown();
		}
	}

	public ZooKeeper getZooKeeper(){
		return zooKeeper;
	}



}
